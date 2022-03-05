package br.com.generation.classes;

public class TestaExCliente01 {

	public static void main(String[] args) {
		
		// Criar um nome para o objeto
		ExCliente01 cl1 = new ExCliente01();
		
		cl1.nome = "Alexandre";
		cl1.idade = 25;
		cl1.endereco = "Rua Pedro Vaz, 1050";
		cl1.sexo = "Feminino";
		cl1.email = "alexandre.l@outlook.com";
		
		System.out.println(cl1.nome);
		System.out.println(cl1.idade);
		System.out.println(cl1.endereco);
		System.out.println(cl1.sexo);
		System.out.println(cl1.email);
		cl1.cadastrar();
		cl1.comprar();

	}

}
