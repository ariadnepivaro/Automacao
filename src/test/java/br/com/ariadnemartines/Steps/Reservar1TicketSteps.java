package br.com.ariadnemartines.Steps;

import br.com.ariadnemartines.Logic.Reservar1TicketLogic;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Reservar1TicketSteps {
	
	private Reservar1TicketLogic reservar1TicketLogic;
	
	public Reservar1TicketSteps() throws Throwable {
		
		reservar1TicketLogic = new Reservar1TicketLogic();
	}
	
	@Given("^que acesso o site \"([^\"]*)\"$")
	public void que_acesso_o_site(String url) throws Throwable {
		reservar1TicketLogic.acessarSite(url);
	}

	@Given("^preencho o campo 'Nome de Usuario' \"([^\"]*)\"$")
	public void preencho_o_campo_Nome_de_Usuario(String usuario) throws Throwable {
		reservar1TicketLogic.preencherUsuario(usuario);
	}

	@Given("^preencho a 'Senha' \"([^\"]*)\"$")
	public void preencho_a_Senha(String senha) throws Throwable {
		reservar1TicketLogic.preencherSenha(senha);
	}

	@Given("^clico no botao 'Sign-In'$")
	public void clico_no_botao_Sign_In() throws Throwable {
		reservar1TicketLogic.clicarSignIn();
	}

	@Then("^seleciono a 'Quantidade de Passageiros' \"([^\"]*)\"$")
	public void seleciono_a_Quantidade_de_Passageiros(String passageiros) throws Throwable {
		reservar1TicketLogic.selecionarPassageiros(passageiros);
	}

	@Then("^seleciono a cidade de origem 'Departing From' \"([^\"]*)\"$")
	public void seleciono_a_cidade_de_origem_Departing_From(String origem) throws Throwable {
		reservar1TicketLogic.selecionarCidadeOrigem(origem);
	}

	@Then("^seleciono o 'Mes de Partida' \"([^\"]*)\"$")
	public void seleciono_o_Mes_de_Partida(String mesPartida) throws Throwable {
		reservar1TicketLogic.selecionarMesPartida(mesPartida);
	}

	@Then("^seleciono a 'Dia de Partida' \"([^\"]*)\"$")
	public void seleciono_a_Dia_de_Partida(String diaPartida) throws Throwable {
		reservar1TicketLogic.selecionarDiaPartida(diaPartida);
	}

	@Then("^seleciono a cidade de destino 'Arriving In' \"([^\"]*)\"$")
	public void seleciono_a_cidade_de_destino_Arriving_In(String cidadeRetorno) throws Throwable {
		reservar1TicketLogic.selecionarCidadeRetorno(cidadeRetorno);
	}

	@Then("^seleciono o 'Mes de Retorno' \"([^\"]*)\"$")
	public void seleciono_o_Mes_de_Retorno(String mesRetorno) throws Throwable {
		reservar1TicketLogic.selecionarMesRetorno(mesRetorno);
	}
	
	@Then("^seleciono o 'Dia de Retorno' \"([^\"]*)\"$")
	public void seleciono_o_Dia_de_Retorno(String diaRetorno) throws Throwable {
		reservar1TicketLogic.selecionarDiaRetorno(diaRetorno);
	}

	@Then("^seleciono a 'Classe de Servico'$")
	public void seleciono_a_Classe_de_Servico() throws Throwable {
		reservar1TicketLogic.clicarClasseServicos();
	}

	@Then("^clico no botao 'Continue'$")
	public void clico_no_botao_Continue() throws Throwable {
		reservar1TicketLogic.clicarContinue();
	}

	@Then("^seleciono o voo de ida em 'Depart'$")
	public void seleciono_o_voo_de_ida_em_Depart() throws Throwable {
		reservar1TicketLogic.clicarVooIda();
	}

	@Then("^seleciono o voo de retorno em 'Return'$")
	public void seleciono_o_voo_de_retorno_em_Return() throws Throwable {
		reservar1TicketLogic.clicarVooRetorno();
	}

	@Then("^clico em 'Continue' Select Flight$")
	public void clico_em_Continue_Select_Flight() throws Throwable {
	    reservar1TicketLogic.clicarContinueFlight();
	}

	@Then("^preencho o 'First Name' \"([^\"]*)\"$")
	public void preencho_o_First_Name(String first) throws Throwable {
		reservar1TicketLogic.preenncherFirstName(first);
	}

	@Then("^preencho o 'Last Name' \"([^\"]*)\"$")
	public void preencho_o_Last_Name(String last) throws Throwable {
		reservar1TicketLogic.preencherLastName(last);
	}

	@Then("^preencho o 'Numero do Cartao' \"([^\"]*)\"$")
	public void preencho_o_Numero_do_Cartao(String number) throws Throwable {
		reservar1TicketLogic.preencherNumeroCartao(number);
	}

	@Then("^clico em 'Secure Purchase'$")
	public void clico_em_Secure_Purchase() throws Throwable {
		reservar1TicketLogic.clicarSecurePurchase();
	}



	
	
	
	
}
