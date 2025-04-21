package desafio_dio_banco;


public class Main {
	
	public static void main(String [] args) {
		
		//Conta contaCorrente = new ContaCorrente(); 
		//Conta contaPoupanca = new ContaPoupanca(); 
		
		
		//contaCorrente.imprimirExtrato();
		//contaPoupanca.imprimirExtrato();
		
		//contaCorrente.depositar(100);
		//contaCorrente.imprimirExtrato();
		
		//contaCorrente.transferir(100, contaPoupanca);
		//contaPoupanca.imprimirExtrato();
		
		//contaCorrente.imprimirExtrato();
		
		
		Cliente c1 = new Cliente("Tiago", new ContaCorrente());
		
		c1.getContaCorrente().depositar(100);
		c1.imprimirExtrato();
		
		System.out.println();
		
		c1.definirContaPoupanca(new ContaPoupanca());
		c1.getContaPoupanca().depositar(200);
		c1.imprimirExtrato();
		
		System.out.println();
		
		c1.getContaCorrente().transferir(50, c1.getContaPoupanca());
		c1.imprimirExtrato();
		
		
		
		
	
		
	
		
		
		
		
		
	
	
	}

}
