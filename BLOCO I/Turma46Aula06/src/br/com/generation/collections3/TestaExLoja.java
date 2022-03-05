package br.com.generation.collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaExLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<ExLoja> lojas = new ArrayList<>();
		
		System.out.println("Quantos produtos você deseja cadastrar?");
		int numeroProdutos = leia.nextInt();
		leia.nextLine();
		
		
		for(int i = 0; i < numeroProdutos; i++) {
			System.out.println("Qual produto você deseja cadastrar? ");
			String produto = leia.next();
			leia.nextLine();			
			
			System.out.println("Qual o custo do produto que deseja cadastrar? ");
			int custo = leia.nextInt();
			leia.nextLine();
			
			System.out.println("Qual a quantidade d "
					+ ""
					+ "disponivel(estoque) do produto que você deseja cadastrar?");
			int quantidade = leia.nextInt();
			
			
			lojas.add(new ExLoja(produto, custo, quantidade));	
		}
		for(ExLoja i: lojas) {
			System.out.println(i);
		}
		
		leia.close();
		
		
	}

}
