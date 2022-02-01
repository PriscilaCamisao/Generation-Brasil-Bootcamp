package br.com.generation.vetores;

public class VetorExemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] arrayVetor = new int[11]; //--> [0]....[9]
		
		double[] vetor = new double[2];
		
		int numero = 300;
		
		arrayVetor[0] = 23;
		arrayVetor[5] = 100;
		
		arrayVetor[9] = 56;		
	
		arrayVetor[7] = numero;		
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println((i+1) + "� - " + arrayVetor[i]);
			
		}
		
		for(int i = 0; i <= 1; i++) {
			System.out.println();
			System.out.println((i+1) + "� - " + vetor[i]);
		}
	}

}
