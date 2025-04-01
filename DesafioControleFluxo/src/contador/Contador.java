package contador;

import java.util.Scanner; 

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in); 
			
		System.out.println("Digite o primeiro número.");
		int parametroUm = terminal.nextInt(); 
		
		System.out.println("Digite o segundo número.");
		int parametroDois = terminal.nextInt();
		
		try {
			
			// Chamando o método contendo a lógica de contagem 
			contar(parametroUm, parametroDois); 
			
		}catch(ParametrosInvalidosException exception) {
			exception.alertarErro();
			
		}
		
		terminal.close();
	}
	
	
	
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
	
		// Validar se parametroUm é maior que parametroDois e lançar a exceção
		
		if(parametroUm > parametroDois) {
			
			throw new ParametrosInvalidosException(); 
		} 
		else {
			int contagem = parametroDois - parametroUm;
		
		// Realizar o for para imprimir os numeros com base na variável contagem}
			for(int i = 1; i <= contagem; i++) {
				System.out.println(" Imprimindo o número " + i + ".");
				}
			}
	
	}

}