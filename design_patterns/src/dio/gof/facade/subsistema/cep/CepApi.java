package dio.gof.facade.subsistema.cep;

public class CepApi {
private static CepApi instancia = new CepApi();
	
	private CepApi(){}
	
	public static CepApi getInstancia(){
		return instancia;
		}
	
	public String recuperarCidade(String cep){
		return "Rio de Janeiro";
	}
	
	
	public String recuperarEstado(String cep){
		return "RJ";
	}
}
