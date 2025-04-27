package br.com.dio.model;

import java.util.Collection;
import java.util.List;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;


import br.com.dio.model.Space;
import static br.com.dio.model.GameStatusEnum.NON_STARTED;
import static br.com.dio.model.GameStatusEnum.COMPLETE;
import static br.com.dio.model.GameStatusEnum.INCOMPLETE;



public class Board {
	
	private final List<List<Space>> spaces;

	public Board(List<List<Space>> spaces) {
		this.spaces = spaces;
	}

	public List<List<Space>> getSpaces() {
		return spaces;
	}
	
	
	// noneMatch verifica se não há ocorrência na lista.
	public GameStatusEnum getStatus() {
		if(spaces.stream().flatMap(Collection::stream).noneMatch(s-> !s.isFixed() && nonNull(s.getActual()))) {
			return NON_STARTED;
		}
		
	// anyMatch verifica se há pelo menos uma ocorrência na Lista.
		return spaces.stream().flatMap(Collection::stream).anyMatch(s-> isNull(s.getActual())) ? INCOMPLETE : COMPLETE;
	}

	
	 
	public boolean hasErrors() {
		if(getStatus().equals(NON_STARTED) ) {
			return false; 
			
		}
		return spaces.stream().flatMap(Collection::stream)
				.anyMatch(s-> nonNull(s.getActual()) && !s.getActual().equals(s.getExpected())); 
		
	}
	
	
	public boolean changeValue(final int col, final int row, final Integer value){
		Space space = spaces.get(col).get(row);
		if(space.isFixed()) {
			return false; 
			
		}
		
		space.setActual(value);
		return true; 
		
	}
	
	
	
	public boolean clearValue(final int col, final int row) {
		Space space = spaces.get(col).get(row);
		if(space.isFixed()) {
			return false; 
			
		}
		
		space.clearspace();
		return true;
		
	}	
	
	
	// Modificado para imprimir Jogo limpo
	public void reset() {
		spaces.forEach(c-> c.forEach(Space::clearspace));
		System.out.println("Jogo limpo\n!");
	}
	
	
	public boolean gameIsFinished() {
		return !hasErrors() && getStatus().equals(COMPLETE);
	}
	
}
