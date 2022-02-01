package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio02LacosDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Faça um programa que entre com três números e coloque em ordem crescente.

		int n1=0, n2=0, n3=0;
				
		Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o 1º número: ");
			n1 = leia.nextInt();
			
			System.out.println("Digite o 2º número: ");
			n2 = leia.nextInt();
			
			System.out.println("Digite o 3º número: ");
			n3 = leia.nextInt();
			
		//Laço de decisão
		if(n1 < n2)
		{
			
			if(n2 < n3) {
				System.out.printf("Os números em ordem crescente são: " ,n1, n2, n3);
				leia.nextInt();
			}
			else if(n1 < n3) {
				System.out.printf("Os números em ordem crescente são: " ,n1, n3, n2);
				leia.nextInt();
			}
			else {
				System.out.printf("Os números em ordem crescente são: " ,n3, n1, n2);
				leia.nextInt();
			}
		}
		
		else if(n2 < n3)
		{
			if(n1 < n3) {
				System.out.printf("Os números em ordem crescente são: " ,n2, n1, n3);
				leia.nextInt();
			}
			else {
				System.out.printf("Os números em ordem crescente são: " ,n2, n3, n1);
				leia.nextInt();
			}
		}
			
		else 
		{
			System.out.printf("Os números em ordem crescente são: " ,n3, n2, n1);
			leia.nextInt();
		
		}
		leia.close();
	}
}
