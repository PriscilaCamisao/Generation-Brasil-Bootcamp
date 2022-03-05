package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio01LacosDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
					
			System.out.println("Digite o 1°número: ");
			n1 = leia.nextInt();
			
			System.out.println("Digite o 2°número: ");
			n2 = leia.nextInt();
			
			System.out.println("Digite o 3°número: ");
			n3 = leia.nextInt();
			
		//Laço de decisão
		if(n1 > n2) {
					
			if(n1 > n3) {
				System.out.printf("O maior número é: " + n1);
			}
			else {
				System.out.printf("O maior número é: " + n3);
			}
		}
		else 
		{
			if(n2 > n3) {
				System.out.printf("O maior número é: " + n2);
			}
			else {
				System.out.printf("O maior número é: " + n3);
			}
		
		}
			leia.close();
	}

}
