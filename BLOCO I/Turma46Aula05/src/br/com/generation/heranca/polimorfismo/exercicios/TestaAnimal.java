package br.com.generation.heranca.polimorfismo.exercicios;

public class TestaAnimal {

	public static void main(String[] args) {


		// Cachorro
		Cachorro cc = new Cachorro();
		
		cc.setNome("O nome do cachorro é Simba.");
		cc.setIdade(3);
		cc.setEmitirSom("Au au au");
		cc.setMovimentacao("Correndo");
		
		System.out.println("Nome: " + cc.getNome());
		System.out.println("Idade: " + cc.getIdade());
		System.out.println("Som que emite: " + cc.getEmitirSom());
		System.out.println("Movimentos: " + cc.getMovimentacao());
		
		
		// Cavalo
		Cavalo cv = new Cavalo();
		
		cv.setNome("O nome do cavalo é Pé de Pano.");
		cv.setIdade(10);
		cv.setEmitirSom("iiiihhiih");
		cv.setMovimentacao("Correndo");
		
		System.out.println("\nNome: " + cv.getNome());
		System.out.println("Idade: " + cv.getIdade());
		System.out.println("Som que emite: " + cv.getEmitirSom());
		System.out.println("Movimentos: " + cv.getMovimentacao());
		
		
		// Preguiça
		Preguica pg = new Preguica();
		
		pg.setNome("O nome da preguiça é Nina");
		pg.setIdade(4);
		pg.setEmitirSom("zzzzzzzzz");
		pg.setMovimentacao("Subindo em árvores");
		
		System.out.println("\nNome: " + pg.getNome());
		System.out.println("Idade: " + pg.getIdade());
		System.out.println("Som que emite: " + pg.getEmitirSom());
		System.out.println("Movimentos: " + pg.getMovimentacao());
		
	}

}
