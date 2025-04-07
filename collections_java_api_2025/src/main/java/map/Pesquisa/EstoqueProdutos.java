package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	//Atributo
	
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		
		this.estoqueProdutosMap = new HashMap<>();
	} 
	
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade)); 	
	}
	
	
	public void exibiProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	
	public double calcularValortotalEstoque() {
		double valorTotalEstoque = 0d;
				
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade()*p.getPreco();
			}
			
		}
	return valorTotalEstoque;}
	
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null; 
		
		double maiorPreco = Double.MIN_VALUE; 
		
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					maiorPreco = p.getPreco();
					produtoMaisCaro = p; 
				}
			}
		}
	return produtoMaisCaro;}
	
	
	
	/*public static void main(String [] args) {
		
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
		estoque.adicionarProduto(2L, "Produto B", 55, 35.0);
		estoque.adicionarProduto(3L, "Produto C", 25, 20.0);
		estoque.adicionarProduto(4L, "Produto D", 30, 2.0);
		
		
		estoque.exibiProdutos();
		
		
		System.out.println("Valor total do estoque: R$" + estoque.calcularValortotalEstoque() );
		
		System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro() );
	}
	
	*/
	

}
