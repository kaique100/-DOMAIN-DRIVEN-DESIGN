package br.com.fiap.excecao;

public class Excecao extends Exception {
	
	public Excecao () {
		super();
		System.out.println("Mensagem de falha");
	}
	
	public Excecao(Exception e) {
		super();
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Digitou outra caractere em vez de numero");
		}else {
			System.out.println("Falha desconhecida");
			
		}
	}
}
