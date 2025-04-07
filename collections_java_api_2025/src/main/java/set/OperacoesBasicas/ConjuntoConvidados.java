package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	//Atributo
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet();	
	} 
	
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite)); 
	}
	
	
	public void  removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite ) {
				convidadoParaRemover = c; 
				break; 
				
			}
			
		}
				
	convidadoSet.remove(convidadoParaRemover); }
	
	
	
	public int contarConvidados() {
		return convidadoSet.size();
	}

	public void exibirconvidados() {
		System.out.println(convidadoSet); 
		
		
	}
	
	
	
	/*public static void main(String [] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(); 
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(as) dentro do set de convidados");
		
		
		conjuntoConvidados.adicionarConvidado("convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("convidado 4", 1237);
		conjuntoConvidados.adicionarConvidado("convidado 5", 1236);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(as) dentro do set de convidados");
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados(as) dentro do set de convidados");
		
		conjuntoConvidados.exibirconvidados();
	} */
	
}
