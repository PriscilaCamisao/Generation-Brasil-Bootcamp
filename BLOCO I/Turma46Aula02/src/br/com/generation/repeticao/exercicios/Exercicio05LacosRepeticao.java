package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio05LacosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		// No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		
		int numero=0, soma=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			soma += numero;
			
		
			}
			while (numero != 0);
				
			System.out.println("A soma dos n�meros n�mero digitados: " + soma);
			
			leia.close();
	}
}
