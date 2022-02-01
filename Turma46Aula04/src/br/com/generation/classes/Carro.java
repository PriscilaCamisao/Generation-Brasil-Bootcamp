package br.com.generation.classes;

public class Carro {

	//Atributos - variáveis
	String marca;
	String modelo;
	int anoFabricacao;
	int velocidade;
	
	//Métodos - verbos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
		
	}
	void freiar(int aceleracao) {
		velocidade = velocidade - aceleracao;
			}
}
