package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio02LacosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		int par=0, impar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite os n�meros: ");
			int n = leia.nextInt();
			
			if(n %2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("H� " +impar+ " n�meros �mpares e " +par+ " n�meros pares");

		leia.close();
	}

}
