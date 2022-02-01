package br.com.generation.repeticao.exercicios;

import java.util.Scanner;

public class Exercicio04LacosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
		// Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		// (1, se a pessoa era calma;2, se a pessoa era nervosa e 3, se a pessoa era agressiva)...
		
		int idade, emocional=0, sexo=0, pCalmas=0, oCalmos=0, mNervosas=0, hAgressivos=0, pNervosas40=0, pCalmas18=0, xPessoas=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(xPessoas<=4) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			System.out.println("Informe seu sexo (1-Feminino)(2-Masculino)(3-Outros): ");
			sexo = leia.nextInt();
			System.out.println("Qual o seu estado emocional(1-Calmo(a))(2-Nervoso(a))(3-Agressivo(a))? ");
			emocional = leia.nextInt();
			
			if(emocional == 1) {
				pCalmas++;
			}
			if(sexo == 1 && emocional == 2) {
				mNervosas++;
			}
			if(sexo == 2 && emocional == 3) {
				hAgressivos++;
			}
			if(sexo == 3 && emocional == 1) {
				oCalmos++;
			}
			if(idade>40 && emocional == 2) {
				pNervosas40++;
			}
			if(idade<18 && emocional == 1) {
				pCalmas18++;
			}
			xPessoas++;
			
		}
		System.out.println("Pessoas calmas: " + pCalmas);
		System.out.println("\nMulheres nervosas: " + mNervosas);
		System.out.println("\nHomens agressivos: " + hAgressivos);
		System.out.println("Outros calmos: " + oCalmos);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + pNervosas40);
		System.out.println("Pessoas calmas com menos de 18 anos: " + pCalmas18);
		
		leia.close();
	
	}

}
