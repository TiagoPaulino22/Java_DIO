package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	// atributos 
	
	private List<Livro> livrosList; 
	
	public CatalogoLivros() {
		this.livrosList = new ArrayList<>(); 
	}

	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livrosList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	
	
	public List<Livro> pesquisarAutor(String autor){
		List<Livro> livrosAutor = new ArrayList<>(); 
		if(!livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosAutor.add(l);
				}
			}
			
		}
	return livrosAutor; }
	
	
	
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>(); 
		if(!livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l); 
				}
				
			}
			
		}
	return livrosPorIntervaloAnos; }
	
	
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livrosPorTitulo = null; 
		if(!livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livrosPorTitulo = l; 
					break; 
				}
				
			}
		}
		
	return livrosPorTitulo; }
	
	
	
	/*public static void main(String [] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros(); 
		
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020); 
		catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021); 
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022); 
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023); 
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994); 
		
		
		System.out.println(catalogoLivros.pesquisarAutor("Autor 1"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2022));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
		
	}*/
	
}

