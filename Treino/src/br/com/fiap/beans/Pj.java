package br.com.fiap.beans;

public class Pj extends Pessoa{
	
	private String cnpj;

	public Pj() {
		super();
	}

	public Pj(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public Pj(String nome, String email, String logradouro, double renda, String cnpj) {
		super(nome, email, logradouro, renda);
		this.cnpj = cnpj;
	}

	public Pj(String nome, String email, String logradouro, double renda, int idade, String cnpj) {
		super(nome, email, logradouro, renda, idade);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String indetificacao() {
		// TODO Auto-generated method stub
		return "PJ";
	}

	@Override
	public String taxa() {
		String informacao = null;
		
		if (idade >= 15){
			informacao = "Paga taxa";
		}else{
			informacao = "N�o paga taxa";
		}
		
		
		return informacao;
	}
	
	
}
