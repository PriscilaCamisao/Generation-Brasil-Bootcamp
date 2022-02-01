package br.com.generation.vetores;

import java.util.Scanner;

public class VetorExemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[4]; //--> [0]...[3]
		double soma = 0.0, media = 0.0;
		
		System.out.println("Digite �s quatro notas do Aluno: ");
		for(int i = 0; i <= 3; i++) {
			System.out.println((i+1) + "� Nota: ");
			notas[i] = entrada.nextDouble(); //---> entrada de dados - Scanner
			
			soma += notas[i];	
			media = soma / (i+1);
		}		
		
		System.out.println("A m�dia do Aluno: " + media);
	}

}
