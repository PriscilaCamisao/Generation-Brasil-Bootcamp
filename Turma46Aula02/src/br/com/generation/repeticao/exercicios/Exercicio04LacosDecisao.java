package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio04LacosDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
		// Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		int num;
		double raiz, potencia;
		
		System.out.println("Digite um n�mero inteiro: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par.........");
			raiz = Math.sqrt(num); //-->
			System.out.println("Raiz quadrada: " + raiz);
		}
		else {
			System.out.println("Impar.......");
			potencia = Math.pow(num, 2);
			System.out.println("Potencia: " + potencia);
			
		leia.close();
		
		}
	}

}

