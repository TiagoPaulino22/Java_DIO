package desafio_dio_banco;


public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta poupança ===");
		super.imprimirInfosComuns();
		
	}
		
}
