package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {
	
	static int soma2;
	static int num1 = 5;
	static int num2 = 3;
	static int mult;
	static int numero3, numero4;
	
	public static void main(String[] args) {
			
	 metodo0();
     metodo1();
     metodo2();
     metodo3();
     metodo4();
     metodo5(numero3,numero4);
     metodo7();
	}
	
	public static void metodo0() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero1: ");
		numero3 = entrada.nextInt();
		System.out.println("Numero2: ");
		numero4 = entrada.nextInt();
	}
	
	public static void metodo1() {
		System.out.println("Eu sou o m�todo1.");
	}
	
	public static void metodo2() {
		double soma = 0.0, numero1 = 10.0, numero2 = 30.0;
		soma = numero1 + numero2;
		System.out.println("Resultado da Soma no metodo2: " + soma);
	}
	
	public static void metodo3() {
		soma2 = num1 + num2;
	}
	
	public static void metodo4() {
		System.out.println("Resultado da soma do metodo3 no metodo4: " + soma2);
	}
	
	public static void metodo5(int n1, int n2) {
		mult = n1 * n2;
		System.out.println("Resultado da multiplica��o no metodo5: " + mult);
	}
	
	public static void metodo7() {
		System.out.println(MetodosFora.metodo6(10, 20));
	}

}

