package br.com.fiap.beans;

public class Pf extends Pessoa{
	
	private String rg;

	
	public Pf() {
		super();
	}
	
	public Pf(String rg) {
		super();
		this.rg = rg;
	}




	public Pf(String nome, String email, String logradouro, double renda, int idade) {
		super(nome, email, logradouro, renda, idade);
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String indetificacao() {
		// TODO Auto-generated method stub
		return "PF";
	}

	@Override
	public String taxa() {
		String informacao = null;
		if(idade >= 38){
			informacao = "Paga taxa";
		}else{
			informacao = "Não paga taxa";
		}
		return informacao;
	}

	public Pf(String nome, String email, String logradouro, double renda, int idade, String rg) {
		super(nome, email, logradouro, renda, idade);
		this.rg = rg;
	}
	
	
}
