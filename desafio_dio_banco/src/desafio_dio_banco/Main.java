package desafio_dio_banco;

public class Main {
	
	public static void main(String [] args) {
		
		Conta contaCorrente = new ContaCorrente(); 
		Conta contaPoupanca = new ContaPoupanca(); 
		
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		
		contaCorrente.depositar(100);
		contaCorrente.imprimirExtrato();
		
		contaCorrente.transferir(100, contaPoupanca);
		contaPoupanca.imprimirExtrato();
		
		contaCorrente.imprimirExtrato();
	
	
	}

}
