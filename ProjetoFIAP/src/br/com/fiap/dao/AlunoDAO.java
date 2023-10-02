package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;
import br.com.fiap.conexoes.ConexaoFactory;

public class AlunoDAO {
	
	public Connection minhaConexao;
	
	public AlunoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("Insert into T_FIAP_ALUNO values(?, ?,?, ?)");
		
		stmt.setInt(1, aluno.getRm());
		stmt.setString(2, aluno.getNome());
		stmt.setString(3, aluno.getTurma());
		stmt.setDouble(4, aluno.getNota());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso!";
	}
	
	public String deletar(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("Delete from T_FIAP_ALUNO where RM_ALUNON = ?");
		stmt.setInt(1, aluno.getRm());
		stmt.executeUpdate();
		stmt.close();
		
	return "Delete com sucesso";	
	}
	
	public String atualizar(Aluno aluno) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				("Update T_FIAP_ALUNO set NOME_ALUNO = ?, TURMA_ALUNO = ?, NOTA_ALUNO = ? where RM_ALUNO = ?");
		
		stmt.setString(1, aluno.getNome());
		stmt.setString(2, aluno.getTurma());
		stmt.setDouble(3, aluno.getNota());
		stmt.setInt(4, aluno.getRm());
		stmt.executeUpdate();
		stmt.close();
		
		return "Atualizado com sucesso";
	}
	
	public List<Aluno> selecionar() throws SQLException{
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		PreparedStatement stmt = minhaConexao.prepareStatement
				("select* from T_FIAP_ALUNO");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Aluno aluno = new Aluno();
			aluno.setRm(rs.getInt(1));
			aluno.setNome(rs.getString(2));
			aluno.setTurma(rs.getString(3));
			aluno.setNota(rs.getDouble(4));
		}
		return listaAlunos;
	}
}
