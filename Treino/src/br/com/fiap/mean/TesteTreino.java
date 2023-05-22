package br.com.fiap.mean;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Pf;
import br.com.fiap.beans.Pj;

public class TesteTreino {

	static int inteiro(String j){
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static String texto(String j){
		return JOptionPane.showInputDialog(j);
	}
	
	static Double real (String j){
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nome, String email, String logradouro, double renda, String cnpj
		Pj objPj = new Pj(texto("Digite o nome da empresa"),
				texto("Digite o email da empresa"),
				texto("Digite o logradouro da empresa"),				
				real("Digite a renda da empresa"),
				inteiro("Digite o tempo da empresa"),
				texto("Digite o cnpj da empresa"));
		//String nome, String email, String logradouro, double renda, int idade
		Pf objPf = new Pf(texto("Digite o nome da pessoa"),
				texto("Digite o email da pessoa"),
				texto("digite o logradouro da pessoa"),
				real("Digite a renda da pessoa"),
				inteiro("Digite a idade da pessoa"));
		
		
		System.out.println("INFORMAÇÕES PJ");
		System.out.println("Email da empresa " + objPj.getNome() +
							"\nIdentificador: " + objPj.indetificacao() +
							"\nTaxa: " + objPj.taxa());
		System.out.println("INFORMACOES PF");
		System.out.println("Email: " + objPf.getEmail() +
							"\nIdenticação: " + objPf.indetificacao() +
							"\nTaxa: " + objPf.taxa());
	}

}
