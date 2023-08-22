package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecao.Excecao;

public class TesteExcecao {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args)throws Excecao {
		// TODO Auto-generated method stub
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto objProduto = null;
		
		do {
			try {
				
				objProduto = new Produto();
				
				objProduto.setTipo(texto("tipo"));
				objProduto.setMarca(texto("Marca"));
				objProduto.setQuantidade(inteiro("Quantidade"));
				objProduto.setValor(real("Valor"));
				
				listaProdutos.add(objProduto);
			} catch (Exception e) {
				// TODO: handle exception
				throw new Excecao(e);
				
			}
			
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar Produtos?",
				"Carrinho de Compras", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0);
		
		for (Produto produto : listaProdutos) {
			System.out.println("Tipo: " + produto.getTipo() +
								"\nMarca: " + produto.getMarca() +
								"\nQuantidade: " + produto.getQuantidade() +
								"\nValor: " + produto.getValor());
		}
	}

}
