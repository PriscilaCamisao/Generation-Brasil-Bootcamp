package br.com.generation.classes;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.modelo = "Corolla";
		c1.marca = "Toyota";
		c1.anoFabricacao = 2003;
		c1.velocidade = 0;
		
		c1.acelerar(120);
		System.out.println("Velocidade: " + c1.velocidade);

		c1.freiar(90);
		System.out.println("Velocidade: " + c1.velocidade);
	}

}
