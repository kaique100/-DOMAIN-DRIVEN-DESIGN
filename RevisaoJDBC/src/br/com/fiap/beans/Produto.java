package br.com.fiap.beans;

public class Produto {
	
	private String tipo;
	private String marca;
	private int quantidade;
	private double valorVenda;
	private double valorCompra;
	
	public Produto() {
		super();
	}

	public Produto(String tipo, String marca, int quantidade, double valorVenda, double valorCompra) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.quantidade = quantidade;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	
}
