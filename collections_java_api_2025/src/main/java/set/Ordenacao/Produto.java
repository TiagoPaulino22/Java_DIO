package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	
	//Atributo 
	
	private long codigo; 
	
	private String nome; 
	
	private double preco; 
	
	private int quantidade;
	

	public Produto(long codigo, String nome, double preco, int quantidade) {
	
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	
	public long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	
	
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	
	
	
	
	// Métodos usados para diferenciar o contato por código, tornando-os exlusivos. Criados em Source-Generate hashCode...
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Produto))
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}
	
	

	@Override
	public int compareTo(Produto p) {
		
		return nome.compareToIgnoreCase(p.getNome());
	} 
	
	
}


class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		
		return Double.compare(p1.getPreco(),p2.getPreco());
	}
	
	
}
