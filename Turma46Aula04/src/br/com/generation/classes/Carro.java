package br.com.generation.classes;

public class Carro {

	//Atributos - vari�veis
	String marca;
	String modelo;
	int anoFabricacao;
	int velocidade;
	
	//M�todos - verbos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
		
	}
	void freiar(int aceleracao) {
		velocidade = velocidade - aceleracao;
			}
}
