package designpatterns.springframework.service;

import designpatterns.springframework.model.Cliente;


// Essa interface utiliza o padrão de projetos Strategy
public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
}
