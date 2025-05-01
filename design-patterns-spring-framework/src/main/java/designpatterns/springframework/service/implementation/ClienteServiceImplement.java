package designpatterns.springframework.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import designpatterns.springframework.model.Cliente;
import designpatterns.springframework.model.ClienteRepository;
import designpatterns.springframework.model.Endereco;
import designpatterns.springframework.model.EnderecoRepository;

import designpatterns.springframework.service.ClienteService;
import designpatterns.springframework.service.ViaCepService;

@Service
public class ClienteServiceImplement implements ClienteService {

		// Singleton: Injetar os componentes do Spring com @Autowired.
		// Strategy: Implementar os métodos definidos na interface.
		// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
	
		@Autowired
		private ClienteRepository clienteRepository;
		@Autowired
		private EnderecoRepository enderecoRepository;
		@Autowired
		private ViaCepService viaCepService;
		
		@Override
		public Iterable<Cliente> buscarTodos() {
			// Buscar todos os Clientes.
			return clienteRepository.findAll();
		}

		@Override
		public Cliente buscarPorId(Long id) {
			// Buscar Cliente por ID.
			Optional<Cliente> cliente = clienteRepository.findById(id);
			return cliente.get();
		}

		@Override
		public void inserir(Cliente cliente) {
			// Varificar se o endereço od Cleinte já existe consultando o CEP
			salvarClienteComCep(cliente);  
		}

		@Override
		public void atualizar(Long id, Cliente cliente) {
			// Buscar Cliente por ID, caso exista:
			Optional<Cliente> clienteBd = clienteRepository.findById(id);
			if (clienteBd.isPresent()) {
				salvarClienteComCep(cliente);
			}
		}

		@Override
		public void deletar(Long id) {
			// Deletar Cliente por ID.
			clienteRepository.deleteById(id);
		}

		
		
		// O método privado abaixo foi criado após o método inserirCliente ser selecioado e refatorado em Refactor/Extract Method. Criando o método salvarCliente, que pôde ser usado em outros métodos.
		private void salvarClienteComCep(Cliente cliente) {
			// Verificar se o Endereco do Cliente já existe (pelo CEP)
			String cep = cliente.getEndereco().getCep();
			Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
				// Caso não exista, integrar com o ViaCEP e persistir o retorno.
				Endereco novoEndereco = viaCepService.consultarCep(cep);
				enderecoRepository.save(novoEndereco);
				return novoEndereco;
			});
			cliente.setEndereco(endereco);
			// Inserir Cliente, vinculando o Endereco (novo ou existente).
			clienteRepository.save(cliente);
		}
}
