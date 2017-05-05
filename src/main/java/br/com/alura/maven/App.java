package br.com.alura.maven;

public class App {
	
	public static void main(String[] args) {
		Produto produto = new Produto("Bala tangerina", 0.15);
		
		System.out.println("Produto: " + produto.getNome() + " - Valor: R$" + produto.getPreco());
	}
}
