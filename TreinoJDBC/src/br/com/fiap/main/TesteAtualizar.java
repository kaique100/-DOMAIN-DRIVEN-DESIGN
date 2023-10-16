package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteAtualizar {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos
		Livro objLivro = new Livro();
		
		LivroDAO dao = new LivroDAO();
		
		objLivro.setCodigo(inteiro("Digite o codigo a ser atualizado"));
		objLivro.setTitulo(texto("Titulo"));
		objLivro.setValor(real("Valor do Livro"));
		
		System.out.println(dao.alterar(objLivro));

	}

}
