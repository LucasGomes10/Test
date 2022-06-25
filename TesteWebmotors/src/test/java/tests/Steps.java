package tests;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Metodos;
import pages.Webmotors;

public class Steps {
	
	Metodos metodos = new Metodos();
	Webmotors web = new Webmotors();
	
	@Dado("que eu esteja no site")
	public void que_eu_esteja_no() {
		metodos.abrirNavegador("https://hportal.webmotors.com.br");

	}

	@Quando("efetuar a pesuisar do veiculo")
	public void efetuar_a_pesuisar_do_veiculo() throws IOException {
		web.pesquisar("AUDI");

	}

	@Entao("entro em contato com o vendedor")
	public void entro_em_contato_com_o_vendedor() throws IOException {
		web.carro();

	}

}
