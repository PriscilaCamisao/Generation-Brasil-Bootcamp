package br.com.generation.exception;

public class Exception {

	public static void main(String[] args) {

		int[] vetor = new int[4];
		
		System.out.println("Antes da Exception!");
		
		try {
		vetor[4] = 10;
		System.out.println(vetor[4]);
		System.out.println("Deu certo!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception connsertada!");
			vetor[3] = 10;
			System.out.println(vetor[3]);
		}
		
	}

}
