package br.com.generation.metodos;

public class MetodosFora {

	public static String metodo6(int i, int f){
		String numeroString = "";
		
		for(int c = i; c <= f; c++) {
			numeroString += c + " - ";
		}
		
		return numeroString;
		
	}
}
