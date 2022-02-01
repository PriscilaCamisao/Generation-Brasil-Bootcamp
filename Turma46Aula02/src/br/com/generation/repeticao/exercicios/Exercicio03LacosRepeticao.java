package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio03LacosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		// Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		
		int idade=0, contador1=0, contador2=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade <= 99)
		{
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			if(idade <= 21) {
				contador1++;
			}
			else if(idade >= 50) {
				contador2++;
			}
		}
		System.out.printf("O total de pessoas com menos de 21 anos são: " + contador1);
		System.out.printf("\nO total de pessoas com mais de 50 anos são: " + contador2);
		
		leia.close();
	}

}
