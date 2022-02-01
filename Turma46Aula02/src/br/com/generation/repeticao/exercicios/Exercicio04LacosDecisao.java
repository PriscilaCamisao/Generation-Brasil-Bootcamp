package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio04LacosDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
		// Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		int num;
		double raiz, potencia;
		
		System.out.println("Digite um número inteiro: ");
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

