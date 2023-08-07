package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static Double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar Objetos
		//String nome, String email, int idade, double renda, String cpf
		PessoaFisica objPf = new PessoaFisica(texto("Informe o nome da Pessoa Física"),
				texto("Email"),
				inteiro("Idade"),
				real("renda"),
				texto("CPF"));
		
		//String nome, String email, int idade, double renda, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("Informe o nome da Pessoa Física"),
				texto("Email"),
				inteiro("Idade"),
				real("renda"),
				texto("CNPJ"));
		
		System.out.println(objPf.identificador());
		System.out.println("Nome da pessoa física" + objPf.getNome() +
							"\nCPF: " + objPf.getCpf() +
							"\nTaxa, Pessoa Física" +  objPf.pagarTaxa());
		System.out.println(objPj.identificador());
		System.out.println("Nome da empresa: " + objPj.getNome() + 
							"\nCNPJ: " + objPj.getCnpj() +
							"\nTaxa, Pessoa Juridica" + objPj.pagarTaxa());
	}

}
