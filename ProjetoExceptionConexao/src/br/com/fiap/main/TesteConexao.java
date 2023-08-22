package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexao.ConexaoFactory;

public class TesteConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Connection c = new ConexaoFactory().conexao();
		
		System.out.println("Conectado ao banco de dados, yeah");
		c.close();
	}

}
