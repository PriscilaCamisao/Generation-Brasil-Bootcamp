package br.com.generation.classes;

public class ExAviao02 {

		// Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em
		// seguida crie um objeto avião, defina as instancias deste objeto e apresente
		// as informações deste objeto no console.

		// Atributos - variáveis
		String linha;
		String destino;
		int assento;
		int saida;
		int velocidade;
		
		// Ações - verbos
		void acelerar(int aceleracao) {
			velocidade = velocidade + aceleracao;
		}
		void voar(int aceleracao) {
			velocidade = velocidade + aceleracao;
		}
		void pousar(int aceleracao) {
			velocidade = velocidade - aceleracao;
		}
		void taixar(int aceleracao) {
			velocidade = velocidade - aceleracao;
		}

}
