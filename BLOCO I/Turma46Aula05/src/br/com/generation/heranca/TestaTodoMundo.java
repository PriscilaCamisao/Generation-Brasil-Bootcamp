package br.com.generation.heranca;

import java.util.Scanner;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do Funcionario: ");
		String nome = entrada.next();
		System.out.println("Digite a idade do Funcionario: ");
		int idade = entrada.nextInt();
		
		System.out.println("Digite o sal�rio do Funcionario: ");
		double salario = entrada.nextInt();
		
		Professor pf1 = new Professor();
		
		pf1.setNome(nome);
		pf1.setIdade(idade);
		pf1.setEndereco("Rua: 2 de Julho - 30");
		pf1.setDisciplina("Hist�ria");
		
		double salarioModificado = salario * 1.10	;
		pf1.setSalario(salarioModificado);
		
		System.out.println("Nome: " + pf1.getNome());
		System.out.println("Idade: " + pf1.getIdade());
		System.out.println("Endere�o: " + pf1.getEndereco());
		System.out.println("Disciplina: " + pf1.getDisciplina());
		System.out.println("Sal�rio: " + pf1.getSalario());
		

	}

}