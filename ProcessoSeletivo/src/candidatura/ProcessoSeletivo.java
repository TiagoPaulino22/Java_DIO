package candidatura;
import java.util.Random; 
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
	String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		
		for(String candidato : candidatos) {
			entrarEmcontato(candidato);
		}
		}
	
	
	
	// Método para entrar em contato com os candidatos
	
	static void entrarEmcontato(String candidato) {
		int tentativasRealizadas = 1; 
		boolean continuarTentando = true; 
		boolean atendeu = false; 
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu; 
		
			if(continuarTentando) {
				tentativasRealizadas++; 
		}
			else 
				System.out.println("Contato realizado com sucesso");
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu) {
			System.out.println("Conseguimos contato com o(a) " + candidato + " na " + tentativasRealizadas + "ª" + " tentativa.");
		}
		else
			System.out.println("Não conseguimos contato com o(a) " + candidato + "," + " o número máximo de "+ tentativasRealizadas + " tentativas"+ " foram realizadas.");
			
	}
	
	
	// Método auxiliar para gerar condições de atendimento e não atendimento de forma aleatória
		
	static boolean atender() {
		return new Random().nextInt(3)==1; 
		}

	
	
	// Método para imprimir os candidatos selecionados 
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		
		for(String candidato : candidatos) {
			System.out.println("O candidato " + candidato + " foi seelecionado!");
		}
	}
	
	
	
	// Método para selecionar os candidatos
	
	static void selecionarCandidatos() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Ana", "Fabricio", "Mirela", "Daniela","Jorge"}; 
		
		int candidatosSelecionados = 0; 
		int candidatoAtual = 0; 
		double salarioBase = 2000.0;; 
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual]; 
			double salarioPretendido = valorPretendido(); 
			
			System.out.println("O candidato " + candidato + " Solicitou esse valor de  salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			
			candidatoAtual++; 
				
		}
	}
	
	
	
	// Método para gerar um valor pretendido aleatório entre 1800 e 2200
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200); 
	}
	
	
	
	// Método para analisar os candidatos
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase >= salarioPretendido) {
			System.out.println("Ligar para o candidato"); 	
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta"); 	
		}
		else {
			System.out.println("Aguardando o resultado dos demais candidatos"); 
		}
	}

}
