package br.com.generation.classes;

public class TestaExProdutoEletronico03 {

	public static void main(String[] args) {
		
		// Criar nome para o objeto
		ExProdutoEletronico03 pe1 = new ExProdutoEletronico03();
		
		pe1.categoria = "Smatphone";
		pe1.marca = "Motorola";
		pe1.modelo = "Modelo Moto G8 Plus";
		pe1.anoFabricacao = 2020;
		pe1.memoriaGB = 64;
		pe1.idEletronico = "ID 9682020";
		
		System.out.println(pe1.categoria);
		System.out.println(pe1.marca);
		System.out.println(pe1.modelo);
		System.out.println(pe1.anoFabricacao);
		System.out.println(pe1.memoriaGB);
		System.out.println(pe1.idEletronico);
		pe1.comprar();
		pe1.cadastrar();
	}

}
