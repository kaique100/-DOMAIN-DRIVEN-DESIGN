package br.com.fiap.mean;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String textoA = "FIAP", textoB = "fiap";
		
		if(textoA.equals(textoB)){
			System.out.println("Igual");
		}else{
			System.out.println("Diferente");
		}
		
		System.out.println("\nQuantidade de caracteres: " + textoA.length());
		System.out.println("\n teste" + textoA.substring(4));
		
	}

}
