package pages;

import java.io.IOException;

import elementos.Elementos;

public class Webmotors {
	
	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();
	
	public void pesquisar (String texto) throws IOException {
		
		metodos.clicar(elemento.getBtncookie());
		metodos.escrever(elemento.getTexto(), texto);
		metodos.clicar(elemento.getResultado());
		metodos.clicar(elemento.getBtnpesquisar());
		metodos.screenshot("CT01 - pesquisa");
		
	}
	
	public void carro() throws IOException {
		
		metodos.clicar(elemento.getSelecionarcarro());
		metodos.screenshot("CT02 -Rsultado pesquisa");

	}

}
