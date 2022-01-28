package br.com.generation.aula01;

public class Exemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1;
		double var2;
		
		var1 = 10;
		var2 = 10.0;
		
		System.out.println("Valor Original da 1º variável: " + var1);
		System.out.println("Valor Original da 2º variável: " + var2);
		
		System.out.println();
		
		var1 = var1 / 4; //--> inteiros
		var2 = var2 / 4; //--> reais
		
		System.out.println("Valor da 1º variável após a divisão: " +var1);
		System.out.println("Valor da 2º variável após a divisão: " +var2);
		
	}

}
