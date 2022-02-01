/**
 * 
 */
package br.com.generation.condicionais;

import java.util.Scanner;

/**
 * @author prisc
 *
 */
public class LacoCondicional02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva uma letra de A até D: ");
		
		char letra = sc.next().charAt(0);
		
		switch(letra) {
		
			case 'a' :
				System.out.println("Anna");
			break;
			case 'b' :
				System.out.println("Brunno");
			break;
			case 'c' :
				System.out.println("Carlos");
			break;
			case 'd' :
				System.out.println("Daniella");
			break;
			default:
				System.out.println("Valor inválido!");
			break;
			
		}	

	}

}
