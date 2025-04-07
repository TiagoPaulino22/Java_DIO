package Testes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        double saldo = scanner.nextDouble();

	        // TODO: Implemente a classificação do cliente com base no saldo:
	        if(saldo < 0){
	          System.out.println("Negativado\n");
	        }
	        else if (saldo == 0 || saldo <= 500){
	          System.out.println("Baixo\n");
	          
	        }
	        else {
	          System.out.println("Confortavel\n");
	        }
	        


	        scanner.close();
	}

}
