package br.com.generation.sobrecarga;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		//Instancia��o de objeto --> criar objeto
		MinhaCalculadora calRetorno = new MinhaCalculadora();
		
		//Somando dois inteiros
		System.out.println(calRetorno.soma(10, 20.2));
		
	}

}
