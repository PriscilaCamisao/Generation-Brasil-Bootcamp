package br.com.generation.repeticao.facaenquanto;

public class ExemploFacaEnquanto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		int i = 0;
		
		do {
			System.out.println("Repetição: " + i );
			++i;
			Thread.sleep(500);
		}while(i <=10);
	
	}	
}
	

