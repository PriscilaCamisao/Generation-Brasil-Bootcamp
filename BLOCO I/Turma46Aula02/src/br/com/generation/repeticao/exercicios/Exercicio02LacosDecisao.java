package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio02LacosDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

		int n1=0, n2=0, n3=0;
				
		Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o 1� n�mero: ");
			n1 = leia.nextInt();
			
			System.out.println("Digite o 2� n�mero: ");
			n2 = leia.nextInt();
			
			System.out.println("Digite o 3� n�mero: ");
			n3 = leia.nextInt();
			
		//La�o de decis�o
		if(n1 < n2)
		{
			
			if(n2 < n3) {
				System.out.printf("Os n�meros em ordem crescente s�o: " ,n1, n2, n3);
				leia.nextInt();
			}
			else if(n1 < n3) {
				System.out.printf("Os n�meros em ordem crescente s�o: " ,n1, n3, n2);
				leia.nextInt();
			}
			else {
				System.out.printf("Os n�meros em ordem crescente s�o: " ,n3, n1, n2);
				leia.nextInt();
			}
		}
		
		else if(n2 < n3)
		{
			if(n1 < n3) {
				System.out.printf("Os n�meros em ordem crescente s�o: " ,n2, n1, n3);
				leia.nextInt();
			}
			else {
				System.out.printf("Os n�meros em ordem crescente s�o: " ,n2, n3, n1);
				leia.nextInt();
			}
		}
			
		else 
		{
			System.out.printf("Os n�meros em ordem crescente s�o: " ,n3, n2, n1);
			leia.nextInt();
		
		}
		leia.close();
	}
}
