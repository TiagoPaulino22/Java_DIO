package contador;
import java.util.Scanner; 

public class ParametrosInvalidosException extends Exception {
	Scanner terminal = new Scanner(System.in);
 
	static void alertarErro() {
		System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		
	}
	    

}
