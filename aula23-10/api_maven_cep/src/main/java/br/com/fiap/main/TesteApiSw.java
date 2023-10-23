package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Planeta;
import br.com.fiap.services.SwService;

public class TesteApiSw {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		SwService sw = new SwService();
		
		String p1 = JOptionPane.showInputDialog("Informe o planeta a ser consultado");
		
		Planeta planeta = sw.getPlaneta(p1);
		
		System.out.println(planeta);
	}

}
