package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio06LacosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir
		// a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		
		int numero=0, nMultiplo=0, media=0, contador=0;
			
		Scanner nsc = new Scanner(System.in);
	
		
		do {
			System.out.println("Digite um valor: "); 
			numero = nsc.nextInt();
			
			if(numero % 3 == 0);
			nMultiplo = nMultiplo + numero;
			contador++;
			}
		
			while(numero != 0);
			
			media = nMultiplo / contador;
			System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
			

			
			
		
		nsc.close();
	}	

}
