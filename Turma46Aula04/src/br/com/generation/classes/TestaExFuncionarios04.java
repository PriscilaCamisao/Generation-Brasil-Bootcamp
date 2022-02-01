package br.com.generation.classes;

public class TestaExFuncionarios04 {

	public static void main(String[] args) {
		
		// Dar nome ao objeto
		ExFuncionarios04 fc1 = new ExFuncionarios04();
		ExFuncionarios04 fc2 = new ExFuncionarios04();
		
		fc1.nome = "Isabelly";
		fc1.endereco = "Rua Ana Nery, 45";
		fc1.idade = 26;
		fc1.cargo = "Gerente Administrativo";
		fc1.salario = "R$4.750,00";
		
		fc2.nome = "Henrique";
		fc2.endereco = "Rua Cicero Moura, 90";
		fc2.idade = 21;
		fc2.cargo = "Auxiliar Financeiro";
		fc2.salario = "R$1.500,00";
		
		System.out.println(fc1.nome);
		System.out.println(fc1.endereco);
		System.out.println(fc1.idade);
		System.out.println(fc1.cargo);
		System.out.println(fc1.salario);
		fc1.trabalhar();
		fc1.folgar();
		
		System.out.println(fc2.nome);
		System.out.println(fc2.endereco);
		System.out.println(fc2.idade);
		System.out.println(fc2.cargo);
		System.out.println(fc2.salario);
		fc2.trabalhar();
		fc2.folgar();
		
	}

}
