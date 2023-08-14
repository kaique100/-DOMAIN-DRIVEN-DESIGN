package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		
		for (int j = 0; j < p.length; j++) {
			total += p[j].getValor() * p[j].getQuantidade();
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto[] vetorProdutos = new Produto[3];
		
		int indice = 0;
		
		do {
			vetorProdutos[indice] = new Produto();
			
			vetorProdutos[indice].setTipo(texto("Tipo"));
			vetorProdutos[indice].setMarca(texto("Marca"));
			vetorProdutos[indice].setQuantidade(inteiro("Quantidade"));
			vetorProdutos[indice].setValor(real("Valor"));
			
			indice ++;
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar Produto no Carrinho?", "Carrinho de compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		for (int i = 0; i < vetorProdutos.length; i++) {
			System.out.println("Tipo: " + vetorProdutos[i].getTipo() +
								"\nMarca: " + vetorProdutos[i].getMarca() +
								"\nQuantidade: " + vetorProdutos[i].getQuantidade() +
								"\nValor: " + vetorProdutos[i].getValor());
		}
		
		System.out.println("Valor Total: " + valorTotal(vetorProdutos, indice));
		
	}

}
