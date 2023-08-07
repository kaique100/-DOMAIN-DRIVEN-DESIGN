package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{

	private String cpf;
	
		
	public PessoaFisica() {
		super();
	}
	
	

	public PessoaFisica(String nome, String email, int idade, double renda, String cpf) {
		super(nome, email, idade, renda);
		this.cpf = cpf;
	}

	

	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	@Override
	public String identificador() {
		// TODO Auto-generated method stub
		return "Pessoa Física";
	}

	@Override
	public double pagarTaxa() {
		double taxaRenda;
		
		if(renda > 2000) {
			return taxaRenda = renda * 12/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
		
	}

}
