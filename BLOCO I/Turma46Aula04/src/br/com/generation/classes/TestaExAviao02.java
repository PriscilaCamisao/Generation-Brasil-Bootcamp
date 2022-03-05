package br.com.generation.classes;

public class TestaExAviao02 {

	public static void main(String[] args) {

		// Criar nome para o objeto
		ExAviao02 av1 = new ExAviao02();
		
		av1.linha = "Azul";
		av1.destino = "Mato Grosso do Sul";
		av1.assento = 186;
		av1.saida = 6;
		av1.velocidade = 0;
		
		av1.acelerar(280);
		System.out.println("Velocidade do avião durante a decolagem: " + av1.velocidade);
		
		av1.voar(470);
		System.out.println("Velocidade do avião durante o voo: " + av1.velocidade);
		
		av1.pousar(480);
		System.out.println("Velocidade do avião durante o pouso: " + av1.velocidade);
		
		av1.taixar(225);
		System.out.println("Velocidade do avião durante a taixação: " + av1.velocidade);
		
	}

}
