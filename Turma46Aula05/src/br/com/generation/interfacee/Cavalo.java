package br.com.generation.interfacee;

public class Cavalo implements Animal {
	
	@Override
	public void somAnimal() {
		System.out.println("O som do Cavalo: iiihhii");
	}
	
	@Override
	public void dormir() {
		System.out.println("Cavalo dormindo: zzzzzz");
	}
	
	@Override
	public void comer() {
		System.out.println("Cavalo comendo: nhac nhac nhac");
	}
}
