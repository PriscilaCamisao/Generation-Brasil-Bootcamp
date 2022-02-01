package br.com.generation.repeticao.para;

public class ExemploFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int numero = 10;
		int i;
		int soma;
	
		for(i = 0, soma = 0; i <= numero; ++i) {
		
			System.out.print("Soma: " + soma + " + " + i);
			soma = soma + i;
			System.out.println(" = " + soma);
		
		}
	
	}
}
