package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		//Dar um nome para o objeto > al1 e new para criar
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		
		al1.nome = "Priscila";
		al1.idade = 25;
		al1.endereco = "Rua Martins Fontes, 461";
		
		al2.nome = "Alexandre";
		al2.idade = 24;
		al2.endereco = "Rua Ana Nery, 65";
		
		
		System.out.println(al1.nome);
		System.out.println(al1.idade);
		System.out.println(al1.endereco);
		al1.estudar();
		al1.fazerProva();
		
		System.out.println(al2.nome);
		System.out.println(al2.idade);
		System.out.println(al2.endereco);
		al2.estudar();
		al2.fazerProva();
		
	}

}
