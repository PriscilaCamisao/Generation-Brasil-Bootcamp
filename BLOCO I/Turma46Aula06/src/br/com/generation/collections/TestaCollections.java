package br.com.generation.collections;
import java.util.ArrayList;

public class TestaCollections {

	public static void main(String[] args) {

		String aula1 = "Bloco I - Java";
		String aula2 = "Bloco II - BackEnd";
		String aula3 = "Bloco III - FrontEnd";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1); // --> [0]
		aulas.add(aula2); // --> [1]
		aulas.add(aula3); // --> [2]
		
		System.out.println(aulas);
		
		aulas.remove(1);
		System.out.println(aulas);
		
		//for each
		for(String i: aulas) {
			System.out.println("Aula: " + i);
		}
	}

}
