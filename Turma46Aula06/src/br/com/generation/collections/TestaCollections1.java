package br.com.generation.collections;

import java.util.ArrayList;

public class TestaCollections1 {

	public static void main(String[] args) {
		String aula1 = "Bloco I - Java";
		String aula2 = "Bloco II - BackEnd";
		String aula3 = "Bloco III - FrontEnd";
		String aula4 = "Bloco IV - Java Mobile";
				
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);// ---> [0]
		aulas.add(aula2);// ---> [1]
		aulas.add(aula3);// ---> [2]
		aulas.add(aula4);// ---> [3]
		
		//System.out.println(aulas);
		
		//aulas.remove(1);
		//System.out.println(aulas);
		
		//for each ---> lambdas
		/*for(String i: aulas) {
			System.out.println("Aula:" + i);
		}*/
		
		//String primeiraAula = aulas.get(0);
		
		//System.out.println(primeiraAula);
		
		//System.out.println(aulas.get(0));
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println((i+1) + "� Aula: "+ aulas.get(i));
		}
	}
}
