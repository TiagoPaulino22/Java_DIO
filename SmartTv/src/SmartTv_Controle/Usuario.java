package SmartTv_Controle;

public class Usuario {

	public static void main(String[] args) {
		
		 SmartTv smartTv = new SmartTv(); 

	        System.out.println("TV Ligada? " + smartTv.ligada);
	        System.out.println("Canal Atual :" + smartTv.canal);
	        System.out.println("Volume Atual :" + smartTv.volume);

	        smartTv.ligar();
	        System.out.println("Novo status TV Ligada? " + smartTv.ligada);
	        
	        smartTv.desligar();
	        System.out.println("Novo status TV Ligada? " + smartTv.ligada);

	        System.out.println("Novo status TV Ligada? " + smartTv.ligada);
	        
	        System.out.println(" ");
	        
	        // Controlando o Volume 
	        System.out.println("O volume atual é: " + smartTv.volume);
	        
	        smartTv.diminuirVolume();
	        smartTv.diminuirVolume(); 
	        
	        smartTv.aumentarVolume();
	        
	        // Controlando canal
	        
	        System.out.println("Canal atual: " + smartTv.canal);
	        smartTv.mudarCanal(10);
	        
	        System.out.println("Novo canal: " + smartTv.canal);
	        smartTv.diminuirCanal();
	        
	        System.out.println("Novo canal: " + smartTv.canal);
	        
	        
	        
	        
	        
	}

}
