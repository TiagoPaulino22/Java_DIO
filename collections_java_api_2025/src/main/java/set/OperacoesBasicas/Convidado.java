package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	// Atributos
	
	private String nome; 
	
	private int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
		
		
	}

	
	// Métodos usados para diferenciar o convite por código, tornando-os exlusivos. Criados em Source-Generate hashCode...
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Convidado))
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}
	
	
	
	
	
	

	

}
