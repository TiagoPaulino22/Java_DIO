package apple;
import apple.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone(); 
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica(); 
		
		System.out.println("\n");
		
		iphone.ligar(); 
		iphone.atender(); 
		iphone.iniciarCorreioVoz();
		
		System.out.println("\n");
		
		iphone.exibirPagina(); 
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}

}
