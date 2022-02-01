package br.com.generation.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1º Nota do Aluno: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a 2º Nota do Aluno: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		// Laço Condicional
		if(media >= 9.0 && media <= 10) {
			System.out.println("Parabéns! Aprovado com honras!" + "\nMédia: " + media);
		}
		else if(media >= 6.0 && media < 9.0) {
			System.out.println("Aprovado!" + "\nMédia" + media);
		}
		else if(media >= 3.0 && media < 6.0) {
			System.out.println("ecuperação!" + "\nMédia" + media);
		}
		else if(media < 0 || media > 10) {
			System.out.println("Erro! Você não pode digitar uma nota menor que 0 e ou maior que 10.");
		}
		else {
			System.out.println("Reprovado!" + "\nMédia" + media);
		}
	}

}
