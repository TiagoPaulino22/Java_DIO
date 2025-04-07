package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;


public class AgendaContatos {
	
	// Atributos 
	
	private Map<String, Integer> agendaContatosMap;
	
	public AgendaContatos() {
		this.agendaContatosMap = new HashMap<>();
	}
	
	
	public void adicionarContato(String nome, Integer telefone ) {
		agendaContatosMap.put(nome, telefone); 
		
	}
	
	
	public void removerContato(String nome) {
		if(!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		}
	}
	
	
	public void exibirContato() {
		System.out.println(agendaContatosMap);
	}
	
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null; 
		if(!agendaContatosMap.isEmpty()) {
			numeroPorNome = agendaContatosMap.get(nome);
		}
	return numeroPorNome;}
	
	
	
/*public static void main(String [] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos(); 
		
		agendaContatos.adicionarContato("Camila", 1234556);
		agendaContatos.adicionarContato("Camila", 1224);
		agendaContatos.adicionarContato("Camila Cavalcante", 111111);
		agendaContatos.adicionarContato("Camila DIO", 645688);
		agendaContatos.adicionarContato("Maria Silva", 11111111);
		
		agendaContatos.exibirContato();
		
		System.out.println("\n");
		
		System.out.println(agendaContatos.pesquisarPorNome("Camila DIO"));
		
		System.out.println("\n");
		
		System.out.println(agendaContatos.pesquisarPorNome("Maria Silva"));
	
		System.out.println("\n");
		
		agendaContatos.removerContato("Camila DIO");
		
		agendaContatos.exibirContato();
			
	} */
	
}
