package br.com.generation.collections3;

public class ExLoja {
	
	// Atributos
	private String produto;
	private int custo;
	private int quantidade;
	
	public ExLoja(String produto, int custo, int quantidade) {
		super();
		this.produto = produto;
		this.custo = custo;
		this.quantidade = quantidade;
	}
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	@Override
	public String toString() {
		return "ExLoja [produto=" + produto + ", custo=" + custo + ", quantidade=" + quantidade +"]";
	}
	

}
