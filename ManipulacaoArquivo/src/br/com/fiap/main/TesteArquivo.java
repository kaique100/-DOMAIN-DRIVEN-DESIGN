package br.com.fiap.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File arquivo = new File("D:\\Kaique\\MinhaLeitura.txt");
		
		Scanner leitor = null;
		
		leitor = new Scanner(arquivo);
		
		
		while (leitor.hasNextLine()) {
			System.out.println(leitor.nextLine());
		}
	}

}
