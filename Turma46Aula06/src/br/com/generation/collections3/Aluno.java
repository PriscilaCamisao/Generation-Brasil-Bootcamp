package br.com.generation.collections3;

public class Aluno {
	
	// Atributos
	private int idade;
	private String nome;
	
	
	// Construtor
	public Aluno(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	
	
	// Métodos
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Aluno [idade=" + idade + ", nome=" + nome + "]";
	}
	
	
}
