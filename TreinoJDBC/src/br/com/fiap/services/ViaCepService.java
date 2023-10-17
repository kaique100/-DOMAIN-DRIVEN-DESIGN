package br.com.fiap.services;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import br.com.fiap.beans.Endereco;

public class ViaCepService {
	
	public Endereco getEndereco(String cep) {
		Endereco endereco = null;
		
		HttpGet request = new HttpGet("https://viacep.com.br/ws/"+ cep+"/json/");
		
		CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
		
		
		return endereco;
	}
	
}
