package br.com.generation.interfacee;

public class Cachorro implements Animal{
	
	String nomeCachorro;
	
	Cachorro(String nome){
		nomeCachorro = nome;
		System.out.println(nomeCachorro);
	}
	
	@Override // sobredescrita de método.
	public void somAnimal() {
		System.out.println("Som do cachorro: AuAu AuAu");
	}
	
	@Override
	public void dormir() {
		System.out.println("Cachorro dormindo: zzzzz");
	}
	
	@Override
	public void comer() {
		System.out.println("Cachorro comendo: nhac nhac");
	}
}
