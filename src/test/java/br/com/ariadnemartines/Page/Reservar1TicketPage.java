package br.com.ariadnemartines.Page;

import org.openqa.selenium.By;

public class Reservar1TicketPage {
	
	private static By textUsuario = By.name("userName");
	private static By textSenha = By.name("password");
	private static By btnSignIn = By.name("login");
	private static By selectPassageiros = By.name("passCount");
	private static By selectCidadeDeOrigem = By.name("fromPort");
	private static By selectMesDePartida = By.name("fromMonth");
	private static By selectDiaDePartida = By.name("fromDay");	
	private static By selectCidadeDeDestino = By.name("toPort");
	private static By selectMesDeRetorno = By.name("toMonth");
	private static By selectDiaDeRetorno = By.name("toDay");
	private static By btnContinue = By.name("findFlights");
	private static By radioClasseEconomica = By.xpath("//*[@name='servClass' and @value='Coach']");
	private static By radioClasseExecutiva = By.xpath("//*[@name='servClass' and @value='Business']");
	private static By radioPrimeiraClasse = By.xpath("//*[@name='servClass' and @value='First']");
	private static By radioVooIda = By.xpath("//*[@value='Blue Skies Airlines$361$271$7:10']");
	private static By radioVooRetorno = By.xpath("//*[@value='Blue Skies Airlines$631$273$14:30']");
	private static By btnContinueSelectFlight = By.name("reserveFlights");
	private static By textCartao = By.name("creditnumber");
	private static By textFirstName = By.name("passFirst0");
	private static By textLastName = By.name("passLast0");
	private static By btnSecurePurchase = By.name("buyFlights");
	private static By ordemGerada = By.xpath("//font/b/font[contains(normalize-space(.), 'Flight Confirmation')]");
	
	public static By getTextUsuario() {
		return textUsuario;
	}
	public static By getTextSenha() {
		return textSenha;
	}
	public static By getBtnSignIn() {
		return btnSignIn;
	}
	public static By getSelectPassageiros() {
		return selectPassageiros;
	}
	public static By getSelectCidadeDeOrigem() {
		return selectCidadeDeOrigem;
	}
	public static By getSelectMesDePartida() {
		return selectMesDePartida;
	}
	public static By getSelectDiaDePartida() {
		return selectDiaDePartida;
	}
	public static By getSelectCidadeDeDestino() {
		return selectCidadeDeDestino;
	}
	public static By getSelectMesDeRetorno() {
		return selectMesDeRetorno;
	}
	public static By getSelectDiaDeRetorno() {
		return selectDiaDeRetorno;
	}
	public static By getBtnContinue() {
		return btnContinue;
	}
	public static By getRadioClassEconomica() {
		return radioClasseEconomica;
	}
	public static By getRadioClasseExecutiva() {
		return radioClasseExecutiva;
	}
	public static By getRadioPrimeiraClasse() {
		return radioPrimeiraClasse;
	}
	public static By getRadioVooIda() {
		return radioVooIda;
	}
	public static By getRadioVooRetorno() {
		return radioVooRetorno;
	}
	public static By getBtnContinueSelectFlight() {
		return btnContinueSelectFlight;
	}
	public static By getTextCartao() {
		return textCartao;
	}
	public static By getTextFirstName() {
		return textFirstName;
	}
	public static By getTextLastName() {
		return textLastName;
	}
	public static By getBtnSecurePurchase() {
		return btnSecurePurchase;
	}
	public static By getOrdemGerada() {
		return ordemGerada;
	}

}
