package br.com.generation.heranca.polimorfismo.exercicios;

public class Animal {
	
	// Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos
	// (observe a tabela), utilize os seus conhecimentos e distribua as características de forma que
	// tudo o que for comum a todos os animais fique na classe Animal: Cachorro, Cavalo, Preguiça.
	
	// Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o
	// método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
	
	
	//Atributos
	private String nome;
	private int idade;
	private String emitirSom;
	
	
	// Getters / Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;

	}
	
}
