package br.com.generation.repeticao.exercicios;

public class Exercicio01LacosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		
		for(int i = 1000; i < 2000; i++) {
			
			if(i % 11 == 5) {
				System.out.println("Valores divididos por 11, onde o resto é 5: " + i);
			}
		}
	}

}
