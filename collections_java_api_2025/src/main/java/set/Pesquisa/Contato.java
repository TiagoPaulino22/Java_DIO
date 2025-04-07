package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
	//Atributos 
	
	private String nome; 
	
	private int numero;
	

	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	
	
	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}



	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", numero=" + numero + "]";
	}


	
	// Métodos usados para diferenciar o contato por nome, tornando-os exlusivos. Criados em Source-Generate hashCode...

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contato))
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}

	
	
	
	
}
