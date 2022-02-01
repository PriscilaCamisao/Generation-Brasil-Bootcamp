package br.com.generation.matrizes;

import java.util.Scanner;

public class MatrizExemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		double soma = 0.0;
		
		
		System.out.println("===Notas dos Alunos===");
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite �s notas: [%d][%d]: " , l,c );
				notasAlunos[l][c] = leia.nextDouble(); //--> add valores na Matriz
				
				soma = soma + notasAlunos[l][c];
			
			}
			System.out.println();
		}
		
		for(int l = 0; l < notasAlunos.length; l++) {
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf(notasAlunos[l][c] + "|");
			}
			System.out.println();
		}
		
		System.out.println("Soma das posi��es da matriz: " + soma);
		
	}

}
