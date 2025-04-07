package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	// atributo 
	
	private List<Tarefa> tarefaList;

	// método constrututor para criar um objeto com atributo tarefalista sendo um ArrayList vazio.
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	} 
	
	

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	
	// criando um ArrayList de tarefas para remover
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t); 
			}
		}
		
		//removendo todas as tarefas do ArrayList
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList); 
		
	}
	
	
	
	/*public static void main(String [] args) {
		
		ListaTarefa listatarefa = new ListaTarefa(); 
		
		System.out.println(listatarefa.obterNumeroTotalTarefas());
		
		
		listatarefa.adicionarTarefa("Tarefa 1");
		listatarefa.adicionarTarefa("Tarefa 1");
		listatarefa.adicionarTarefa("Tarefa 3");
		System.out.println(listatarefa.obterNumeroTotalTarefas());
		
		
		
		listatarefa.removerTarefa("Tarefa 3");
		System.out.println(listatarefa.obterNumeroTotalTarefas());
		
		
		listatarefa.obterDescricoesTarefas();
	}*/
	
}


