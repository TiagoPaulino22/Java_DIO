package dio.gof.main;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.strategy.ComportamentoNormal;
import dio.gof.strategy.Robo;
import dio.gof.strategy.Comportamento;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;

public class Main {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia(); 
		System.out.println(lazy); 

		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy); 

		SingletonEager eager = SingletonEager.getInstancia(); 
		System.out.println(eager); 

		eager = SingletonEager.getInstancia();
		System.out.println(eager); 
		
		
		System.out.println("\n");
		
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo(); 
		
		Robo robo = new Robo(); 
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();

		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();

		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		System.out.println("\n");
		
		// Facade
		
		Facade facade = new Facade(); 
		facade.migrarCliente("Venilton", "145455660" );
		
	}

}
