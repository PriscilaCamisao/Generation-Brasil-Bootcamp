package br.com.generation.repeticao;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int numero = - 1;
		
		while(numero != 10) {
			
			System.out.println("Digite um n�mero: ");
			numero = in.nextInt();
			if(numero == 10) {
				System.out.println("Voc� acertou");
			}
			else {
				System.out.println("Voc� errou");
			}
		}
	}

}
