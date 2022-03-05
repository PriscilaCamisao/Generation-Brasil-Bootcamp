package br.com.generation.construtor;

import java.util.Scanner;

public class TestaPessoa02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		int idade = sc.nextInt();
		
		

		Pessoa02 p1 = new Pessoa02(nome, idade);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);

	}

}
