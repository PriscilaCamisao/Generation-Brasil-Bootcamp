package br.com.generation.aula01;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int a, b, soma, divisao, subtracao, multiplicacao, resto;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		soma = a + b;
		divisao = a/ b;
		subtracao = a - b;
		multiplicacao = a * b;
		resto = a % b;
		
		System.out.println("A soma de A = B: " + soma);
		System.out.println("A divisao de A + B: " + divisao);
		System.out.println("A subtracao de A + B: " + subtracao);
		System.out.println("A multiplicacao de A + B: " + multiplicacao);
		System.out.println("O resto de A + B: " + resto);
		
		leia.close();
		
	}

}
