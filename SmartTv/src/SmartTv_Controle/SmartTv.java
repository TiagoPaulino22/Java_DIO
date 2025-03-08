package SmartTv_Controle;

public class SmartTv {
	
	boolean ligada  = false; 
	int canal = 1;
	int volume = 25; 


	public void ligar(){
		ligada = true;

	}

	public void desligar(){
		 ligada = false;

	    }
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando Volume para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--; 
		System.out.println("Diminuindo Volume para: " + volume);
	}
	
	
	public void diminuirCanal() {
		canal--; 
		System.out.println("Diminuindo canal para: " + canal);
	}
	
	public void aumentarCanal() {
		canal++; 
		System.out.println("Aumentando canal para: " + canal);
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		
	}

}
