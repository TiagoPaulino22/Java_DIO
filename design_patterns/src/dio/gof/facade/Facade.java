package dio.gof.facade;

import dio.gof.facade.subsistema.cep.CepApi;
import dio.gof.facade.subsistema.crm.CrmService;

public class Facade {
	
	public void migrarCliente(String nome, String cep){
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
