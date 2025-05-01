package designpatterns.springframework.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import designpatterns.springframework.model.Endereco;


//Client HTTP criado via OpenFeignpara o consumo da API do ViaCEP

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
	
		@GetMapping("/{cep}/json/")
		Endereco consultarCep(@PathVariable("cep") String cep);

		
}
