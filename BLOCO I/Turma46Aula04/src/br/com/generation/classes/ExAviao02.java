package br.com.generation.classes;

public class ExAviao02 {

		// Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em
		// seguida crie um objeto avi�o, defina as instancias deste objeto e apresente
		// as informa��es deste objeto no console.

		// Atributos - vari�veis
		String linha;
		String destino;
		int assento;
		int saida;
		int velocidade;
		
		// A��es - verbos
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
