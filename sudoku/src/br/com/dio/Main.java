package br.com.dio;

import br.com.dio.model.Board;
import br.com.dio.model.Space;
import br.com.dio.util.BoardTemplate;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream; 

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.util.ArrayList;
import java.util.List;



public class Main {

	private final static Scanner scanner = new Scanner(System.in);
	
	private static Board board; 
	
	private final static int BOARD_LIMIT = 9; 
	
	
	public static void main(String[] args) {
		
		final var positions = Stream.of(args).collect(Collectors.toMap(
				k-> k.split(";")[0], 
				v-> v.split(";")[1]));
		
		int option = -1; 
		
		while(true){
			System.out.println("Selecione uma das opções a seguir");
			System.out.println("1 - Iniciar um novo jogo");
			System.out.println("2 - Colocar um novo número ");
			System.out.println("3 - Remover um número");
			System.out.println("4 - Visualizar jogo atual");
			System.out.println("5 - Verificar status do jogo");
			System.out.println("6 - Limpar jogo");
			System.out.println("7 - Finalizar jogo");
			System.out.println("8 - Sair");
			
			option = scanner.nextInt();
		
		
		switch (option) {
			case 1 -> startGame(positions); 
			case 2 -> inputNumber();
			case 3 -> removeNumber();
			case 4 -> showCurrentGame();
			case 5 -> showGameStatus();
			case 6 -> clearGame(); 
			case 7 -> finishgame();
			case 8 -> System.exit(0);
			default -> System.out.println("Opção inválida, selecione uma das opções do menu");
		}
		
	}
}

	
	
	// 1 - Iniciar o jogo 
	private static void startGame(Map<String, String> positions) {
		if(nonNull(board)) {
			System.out.println("O jogo já foi iniciado\n");
			return;
		}
		
		List<List<Space>> spaces = new ArrayList<>();
		
		for(int i = 0 ; i< BOARD_LIMIT; i++) {
			spaces.add(new ArrayList<>());
			
			for(int j = 0; j< BOARD_LIMIT; j++) {
				String positionConfig  = positions.get("%s,%s".formatted(i,j));
				int expected = Integer.parseInt(positionConfig.split(",")[0]);
				boolean fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
				Space currentSpace = new Space(expected, fixed);
				spaces.get(i).add(currentSpace);
			}
			
		}
		
		
		board = new Board(spaces); 
		System.out.println("O jogo está pronto para começar\n");
		
	}
	
	
	// 2 - Colocar um novo número
	private static void inputNumber() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
	
		System.out.println("Informe a coluna em que o número será inserido");
		int col = runUltilGetValidNumber(0, 8);
		
		System.out.println("Informe a linha em que o número será inserido");
		int row = runUltilGetValidNumber(0, 8);
		
		System.out.printf("Informe o número que vai entrar na posição [%s, %s]\n", col, row);
		int value = runUltilGetValidNumber(1, 9);
		
		if(!board.changeValue(col, row, value)) {
			System.out.printf("A posição [%s, %s] tem um valor fixo\n", col, row);
			
		}else {
			System.out.printf("Foi inserido o %s na posição [%s, %s].\n",value, col, row);
		}
	}
	
	
	// 3 - Remover um número
	private static void removeNumber() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
	
		System.out.println("Informe a coluna em que o número será inserido");
		int col = runUltilGetValidNumber(0, 8);
		
		System.out.println("Informe a linha em que o número será inserido");
		int row = runUltilGetValidNumber(0, 8);
		
		if(board.clearValue(col, row)) {
			System.out.printf("A posição [%s, %s] tem um valor fixo\n", col, row);
		}
		
	}
	
	
	// 4 - Visualizar jogo atual
	private static void showGameStatus() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		System.out.printf("O jogo atualmente se encontra no status %s\n", board.getStatus().getLabel() );
		if(board.hasErrors()) {
			System.out.println("O jogo contém erros");
		}else {
			System.out.println("O jogo não contém erros");
		}
	}
	
	
	
	
	// 5 - Verificar status do jogo 
	private static void showCurrentGame() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		var args = new Object[81];
		var argPos = 0; 
		for(int i = 0; i<BOARD_LIMIT; i++) {
			for(var col: board.getSpaces()) {
				args[argPos ++] = " " + ((isNull(col.get(i).getActual())) ? " ": col.get(i).getActual());
			}
		}
		
		System.out.println("Seu jogo se encontra de seguinte forma");
		System.out.printf(BoardTemplate.BOARD_TEMPLATE + "%n", args);
		
	}
	
	
	
		// 6 - limpar jogo 
	private static void clearGame() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
			
		System.out.println("Tem certeza que deseja limpar seu jogo e perder todo o seu progresso? ");
		String confirm = scanner.next();
		while(!confirm.equalsIgnoreCase("sim") && !confirm.equalsIgnoreCase("não")) {
			System.out.println("Informe sim ou não");
			confirm = scanner.next();
		}
			
		if(confirm.equalsIgnoreCase("sim")) {
			board.reset();
			
		}
	}

	
	
	// 7 - finalizar jogo
	private static void finishgame() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		if(board.gameIsFinished()) {
			System.out.println("Parabéns você conclui o jogo");
			showCurrentGame();
			board= null;
		}else if(board.hasErrors()) {
			System.out.println("Seu board contém erros, verifique seu board e ajuste-o");
		}else {
			System.out.println("Você ainda precisa preencher algum espaço ");
		}
		
	}


	
	
	// Método utilitário 
	
	private static int runUltilGetValidNumber(final int min, final int max) {
		int current = scanner.nextInt();
		
		while(current < min || current > max) {
			System.out.printf("Informe um número entre %s e %s\n", min, max);
		}
		
		return current; 
	}

}
