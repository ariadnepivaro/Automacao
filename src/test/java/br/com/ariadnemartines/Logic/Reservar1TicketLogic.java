package br.com.ariadnemartines.Logic;

import br.com.ariadnemartines.Driver.Driver;
import br.com.ariadnemartines.Page.Reservar1TicketPage;
import br.com.ariadnemartines.Utils.Excel;
import br.com.ariadnemartines.Utils.Utils;

public class Reservar1TicketLogic {

	private Reservar1TicketPage reservar1TicketPage;
	private Utils utils;
	private Excel excel;

	public Reservar1TicketLogic() throws Throwable {

		reservar1TicketPage = new Reservar1TicketPage();
		utils = new Utils();
	}

	public void acessarSite(String url) throws Throwable {
		utils.esperaEmSegundos(6);
		Driver.getWebPage(url);
	}

	public void preencherUsuario(String usuario) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getTextUsuario());
		utils.preencherTexto(Driver.getWebDriver(), reservar1TicketPage.getTextUsuario(), usuario);
	}

	public void preencherSenha(String senha) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getTextSenha());
		utils.preencherTexto(Driver.getWebDriver(), reservar1TicketPage.getTextSenha(), senha);
	}

	public void clicarSignIn() throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getBtnSignIn());
		utils.clicarBotao(Driver.getWebDriver(), reservar1TicketPage.getBtnSignIn());
	}

	public void selecionarPassageiros(String passageiros) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getSelectPassageiros());
		utils.selecionaListBox(Driver.getWebDriver(), reservar1TicketPage.getSelectPassageiros(), passageiros);
	}

	public void selecionarCidadeOrigem(String origem) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getSelectCidadeDeOrigem());
		utils.selecionaListBox(Driver.getWebDriver(), reservar1TicketPage.getSelectCidadeDeOrigem(), origem);
	}

	public void selecionarMesPartida(String mesPartida) throws Throwable {
		switch (mesPartida) {
		case "12":
			mesPartida = "December";
			break;

		default:
			System.out.println("nao encontrou");
			break;
		}
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getSelectMesDePartida());
		utils.selecionaListBox(Driver.getWebDriver(), reservar1TicketPage.getSelectMesDePartida(), mesPartida);
	}

	public void selecionarDiaPartida(String diaPartida) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getSelectDiaDePartida());
		utils.selecionaListBox(Driver.getWebDriver(), reservar1TicketPage.getSelectDiaDePartida(), diaPartida);
	}

	public void selecionarCidadeRetorno(String cidadeRetorno) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getSelectCidadeDeDestino());
		utils.selecionaListBox(Driver.getWebDriver(), reservar1TicketPage.getSelectCidadeDeDestino(), cidadeRetorno);
	}

	public void selecionarMesRetorno(String mesRetorno) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getSelectMesDeRetorno());
		utils.selecionaListBox(Driver.getWebDriver(), reservar1TicketPage.getSelectMesDeRetorno(), mesRetorno);
	}

	public void selecionarDiaRetorno(String diaRetorno) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getSelectDiaDeRetorno());
		utils.selecionaListBox(Driver.getWebDriver(), reservar1TicketPage.getSelectDiaDeRetorno(), diaRetorno);
	}

	public void clicarClasseServicos() throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getRadioPrimeiraClasse());
		utils.clicaRadioButton(Driver.getWebDriver(), reservar1TicketPage.getRadioPrimeiraClasse());
	}

	public void clicarContinue() throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getBtnContinue());
		utils.clicarBotao(Driver.getWebDriver(), reservar1TicketPage.getBtnContinue());
	}

	public void clicarVooIda() throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getRadioVooIda());
		utils.clicaRadioButton(Driver.getWebDriver(), reservar1TicketPage.getRadioVooIda());
	}

	public void clicarVooRetorno() throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getRadioVooRetorno());
		utils.clicaRadioButton(Driver.getWebDriver(), reservar1TicketPage.getRadioVooRetorno());
	}

	public void clicarContinueFlight() throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getBtnContinueSelectFlight());
		utils.clicaRadioButton(Driver.getWebDriver(), reservar1TicketPage.getBtnContinueSelectFlight());
	}

	public void preenncherFirstName(String first) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getTextFirstName());
		utils.preencherTexto(Driver.getWebDriver(), reservar1TicketPage.getTextFirstName(), first);
	}

	public void preencherLastName(String last) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getTextLastName());
		utils.preencherTexto(Driver.getWebDriver(), reservar1TicketPage.getTextLastName(), last);
	}

	public void preencherNumeroCartao(String number) throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getTextCartao());
		utils.preencherTexto(Driver.getWebDriver(), reservar1TicketPage.getTextCartao(), number);
	}

	public void clicarSecurePurchase() throws Throwable {
		utils.esperaAteElementoEstarClicavel(reservar1TicketPage.getBtnSecurePurchase());
		utils.clicarBotao(Driver.getWebDriver(), reservar1TicketPage.getBtnSecurePurchase());
	}

}
