package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {

	
	private String cnpj;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String email, int idade, double renda, String cnpj) {
		super(nome, email, idade, renda);
		this.cnpj = cnpj;
	}
	
	

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String identificador() {
		// TODO Auto-generated method stub
		return "Pessoa Juridico";
	}

	@Override
	public double pagarTaxa() {
		// TODO Auto-generated method stub
	double taxaRenda;
		
		if(renda > 2000) {
			return taxaRenda = renda * 20/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}

}
