package main.java.map.Ordenacao;


import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap; 

public class AgendaEventos {
	
	// Atributo 
	
	private Map<LocalDate, Evento> eventosMap;

	
	public AgendaEventos() {
	
		this.eventosMap = new HashMap<>();
	} 
	
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao); 
		eventosMap.put(data, evento); 
	}
	
	
	// TreeMp vai ordenar eventosMap em ordem crescente.
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap); 
		System.out.println(eventosTreeMap);
	}
	
	
	
	// No vídeo, a instrutora colocou na condição do for enventosMap ao invés de envetosTreeMap, resultando na ordenação errada dos eventos. 
	public void obterProximoEvento() {
		LocalDate  dataAtual = LocalDate.now();
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap); 
			for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()) {
				if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
					System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey() );
				}
			}
		}
		

	
	
	
	// Colocará na ordem os eventos que virão após a data atual.
	 public static void main(String [] args) { 
		 AgendaEventos agendaEventos = new AgendaEventos(); 
		 
		 agendaEventos.adicionarEvento(LocalDate.of(2026, Month.JULY,15), "Evento 1", "Atração 1");
		 agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY,10), "Evento 2", "Atração 2");
		 agendaEventos.adicionarEvento(LocalDate.of(2027, Month.JANUARY,12), "Evento 3", "Atração 3");
		 agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JUNE,14), "Evento 4", "Atração 4");
		 agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JULY,10), "Evento 5", "Atração 5");
		 
		 agendaEventos.exibirAgenda();
		 
		 agendaEventos.obterProximoEvento();
		 
	 }


}
