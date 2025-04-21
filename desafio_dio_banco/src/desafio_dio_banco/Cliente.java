package desafio_dio_banco;
import desafio_dio_banco.ContaCorrente;
import desafio_dio_banco.ContaPoupanca;

public class Cliente  {
	
	

		private String nome;
	    private ContaCorrente contaCorrente; 
	    private ContaPoupanca contaPoupanca;

	    // Construtor que inicializa o cliente com uma conta corrente
	    public Cliente(String nome, ContaCorrente contaCorrente) {
	        this.nome = nome;
	        this.contaCorrente = contaCorrente;
	        this.contaPoupanca = null;								 // Inicia sem conta poupança
	    }

	    
	   
	    public void definirContaPoupanca(ContaPoupanca contaPoupanca) {
	        this.contaPoupanca = contaPoupanca;
	    }

	    public ContaCorrente getContaCorrente() {
	        return contaCorrente;
	    }

	    public ContaPoupanca getContaPoupanca() {
	        return contaPoupanca;
	    }

	    
	    
	    public String getNome() {
			return nome;
		}


	    
		public void imprimirExtrato() {
	    	System.out.println("     ===     " + this.nome + "     ===     ");
		    this.contaCorrente.imprimirExtrato();
		    
		    if(this.contaPoupanca != null) {
		    	
		    	this.contaPoupanca.imprimirExtrato();
		    } 
		    else 
		    	System.out.println("Não possui conta poupança!");
			
	    }
	  
}
	
	
	
	

	
	
	
	
	

