package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AgendaContatos {
	
 // Atributo 
	public Set<Contato> contatoSet;

	
	public AgendaContatos() {
	
		this.contatoSet = new HashSet<>();
		}
	
	
	public void adicionarContato(String nome, int numero ) {
		
		contatoSet.add(new Contato(nome, numero));
	}
	
	
	public void exibirContatos() {
		System.out.println(contatoSet);
		
	}
	
	
	public Set<Contato>	pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>(); 
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
			
		}

		return contatosPorNome; }
	
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
				for(Contato c : contatoSet) {
					if(c.getNome().equalsIgnoreCase(nome)) {
						c.setNumero(novoNumero);
						contatoAtualizado = c;
						break;
					}
					
				}	
	  return contatoAtualizado; }

	
	
	/*public static void main(String [] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos(); 
		
		agendaContatos.adicionarContato("Camila", 1234556);
		agendaContatos.adicionarContato("Camila", 0);
		agendaContatos.adicionarContato("Camila Cavalcante", 111111);
		agendaContatos.adicionarContato("Camila DIO", 645688);
		agendaContatos.adicionarContato("Maria Silva", 11111111);
		
		agendaContatos.exibirContatos();
		
		System.out.println("\n");
		
		System.out.println(agendaContatos.pesquisarPorNome("Camila DIO"));
		
		agendaContatos.atualizarNumeroContato("Maria Silva", 22222222);
		
		System.out.println("\n");
		
		System.out.println(agendaContatos.pesquisarPorNome("Maria"));
		
	}*/
	
	
} 
	
	
	
	

