package apple;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	
   // Reprodutor Musical  
	public void tocar() {
		System.out.println("Tocando Música.");  
	}
	
	public void pausar() {
		System.out.println("Música pausada."); 
		
	}
	
	public void selecionarMusica() {
		System.out.println("Selecione uma música."); 
	} 
	
	
	// Aparelho Telefonico
	
	public void ligar() {
		System.out.println("Ligando para Ciclano."); 
	}
	
	public void atender() {
		System.out.println("Atendendo chamada."); 
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Reproduxindo correio de voz."); 
	}
	
	
	// Navegador Internet 
	public void exibirPagina() {
		System.out.println("Exibindo página."); 
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada."); 
	}
	
	public void atualizarPagina() {
		System.out.println("Página atualizada."); 
		
	} 
	
	
}
