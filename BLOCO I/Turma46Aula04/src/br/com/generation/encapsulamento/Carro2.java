package br.com.generation.encapsulamento;

public class Carro2 {

	//Atributos - vari�veis
	//Adicionando o "private" na frente j� est� encapsulando
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	//M�todo de servi�os de acesso aos atributos
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
