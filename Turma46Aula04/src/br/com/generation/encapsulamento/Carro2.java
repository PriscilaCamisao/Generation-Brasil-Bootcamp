package br.com.generation.encapsulamento;

public class Carro2 {

	//Atributos - variáveis
	//Adicionando o "private" na frente já está encapsulando
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	//Método de serviços de acesso aos atributos
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	

}
