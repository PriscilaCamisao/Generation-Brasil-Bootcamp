package br.com.generation.aula01;

import java.util.Scanner;

public class Exc01ProgramacaoSequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Faça um sistema que leia a idade de uma pessoa em anos, meses e dias
		// e mostre-a expressa em dias.
		
		Scanner leia = new Scanner(System.in);
				
		int dias, anos, meses, DiasNoAno, DiasNoMes;
				
		DiasNoMes = 30;
		DiasNoAno = 365;
		
		System.out.println("Informe sua idade: ");
		anos = leia.nextInt();
		
		System.out.println("Meses: ");
		meses = leia.nextInt();
		
		System.out.println("Dias: ");
		dias = leia.nextInt();
		
		dias = (anos * DiasNoAno) + (meses * DiasNoMes) + dias;
				
		System.out.println("\nSua idade em dias: " + dias);
		
		leia.close();
		
	}

}
