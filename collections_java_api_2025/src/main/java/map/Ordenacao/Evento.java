package main.java.map.Ordenacao;

public class Evento {

	//Atributos 
	
	private String nome;
	
	private String atração;

	public Evento(String nome, String atração) {
		this.nome = nome;
		this.atração = atração;
	}

	
	public String getNome() {
		return nome;
	}

	public String getAtração() {
		return atração;
	}
	
	


	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", atração=" + atração + "]";
	} 
	
	
	
	
	
	
	
}
