package Conta;

import java.util.Scanner; 

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Olá! Vamos criar uma conta? \n");
		System.out.println("Aperte Enter para continuar. \n");
		String continua = entrada.nextLine();
		
			
		System.out.println("Por favor, digite o seu nome.");
		String nomeCliente = entrada.nextLine();
		
		
		System.out.println("Por favor, digite o número da Agência com 4 dígitos.");
		String agencia = entrada.next();
		StringBuilder agenciaFormatada = new StringBuilder(agencia); 
		
		
		
		System.out.println("Por favor, digite o número da conta com 4 dígitos.");
		int numero = entrada.nextInt();
		
		System.out.println("Você precisa depositar um valor inicial para abrir a conta. Digite o valor que deseja depositar.");
		double saldo = entrada.nextDouble();
		
		
		System.out.println("Olá," + nomeCliente.toUpperCase() + ". " + "Obrigado por criar uma conta em nosso banco, sua agência é " + agenciaFormatada.insert(3, "-") + ", "+ "conta " + numero + " e seu saldo " + "R$"+ saldo + " já está disponível para saque.");
 
		entrada.close();
	
	}

}
