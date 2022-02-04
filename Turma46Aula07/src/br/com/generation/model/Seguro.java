package br.com.generation.model;

public class Seguro {

	private String cobertura;
	private double valorFranquias;
	
	
	public Seguro(String cobertura, double valorFranquias) {
		super();
		this.cobertura = cobertura;
		this.valorFranquias = valorFranquias;
	}
	
	
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	public double getValorFranquias() {
		return valorFranquias;
	}
	public void setValorFranquias(double valorFranquias) {
		this.valorFranquias = valorFranquias;
	}
	

}
