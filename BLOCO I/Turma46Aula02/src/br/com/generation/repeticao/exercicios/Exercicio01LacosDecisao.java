package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio01LacosDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
					
			System.out.println("Digite o 1�n�mero: ");
			n1 = leia.nextInt();
			
			System.out.println("Digite o 2�n�mero: ");
			n2 = leia.nextInt();
			
			System.out.println("Digite o 3�n�mero: ");
			n3 = leia.nextInt();
			
		//La�o de decis�o
		if(n1 > n2) {
					
			if(n1 > n3) {
				System.out.printf("O maior n�mero �: " + n1);
			}
			else {
				System.out.printf("O maior n�mero �: " + n3);
			}
		}
		else 
		{
			if(n2 > n3) {
				System.out.printf("O maior n�mero �: " + n2);
			}
			else {
				System.out.printf("O maior n�mero �: " + n3);
			}
		
		}
			leia.close();
	}

}
