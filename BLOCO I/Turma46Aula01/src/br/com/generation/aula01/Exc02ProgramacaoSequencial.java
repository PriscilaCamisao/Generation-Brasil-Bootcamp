package br.com.generation.aula01;

import java.util.Scanner;

public class Exc02ProgramacaoSequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		// expressa em anos, meses e dias.
		
		Scanner leia = new Scanner(System.in);
		
		int dias, anos, meses, DiasNoAno;
		
		
		DiasNoAno = 365;
			
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = dias / DiasNoAno;
		meses = (dias % DiasNoAno) / 30;
		dias = (dias % DiasNoAno) % 30;
		
		System.out.println("Sua idade em em anos s�o: " + anos);
		System.out.println("Sua idade em meses s�o: " + meses);
		System.out.println("Sua idade em dias s�o: " + dias);
		
		leia.close();            
		
		
		
		

	}

}
