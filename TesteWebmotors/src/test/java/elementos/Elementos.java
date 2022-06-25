package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By texto = By.id("searchBar");
	private By btncookie = By.cssSelector("button[class='sc-htoDjs gtMZoW']");
	private By btnpesquisar = By.id("searchBar");
	private By resultado = By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/div/div/div/div/a/div[2]");
	private By selecionarcarro = By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/a[1]");


	public By getBtncookie() {
		return btncookie;
	}

	public By getBtnpesquisar() {
		return btnpesquisar;
	}

	public By getTexto() {
		return texto;
	}

	public By getResultado() {
		return resultado;
	}

	public By getSelecionarcarro() {
		return selecionarcarro;
	}

}
