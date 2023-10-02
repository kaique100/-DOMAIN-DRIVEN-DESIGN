package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

public class TesteAtualizar {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Aluno objAluno = new Aluno();
		
		AlunoDAO dao = new AlunoDAO();
		
		objAluno.setRm(inteiro("Digite o rm do aluno que será atualizado"));
		objAluno.setNome(texto("Nome"));
		objAluno.setTurma(texto("Turma"));
		objAluno.setNota(real("Nota"));
		
		
	}

}
