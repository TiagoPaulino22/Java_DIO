package main.java.list.OperacoesBasicas;

public class Tarefa {
	
	
	//atributo 
	
	private String descricao;
	

	public String getDescricao() {
		return descricao;
	}

	
	public Tarefa(String descricao) {

		this.descricao = descricao;
	}

	
	@Override
	public String toString() {
		return "Tarefa{ descricao='" + descricao + '\'' + "}" ;
	}
	
}
