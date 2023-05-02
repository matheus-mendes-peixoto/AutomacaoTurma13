package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
    private By btnPopUp = By.id("onetrust-accept-btn-handler");
	private By btnParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCPF = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");
	public By getBtnParaVoce() {
		return btnParaVoce;
	}

	
	
	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCPF() {
		return campoCPF;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}

	

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}



	public By getBtnPopUp() {
		return btnPopUp;
	}

}