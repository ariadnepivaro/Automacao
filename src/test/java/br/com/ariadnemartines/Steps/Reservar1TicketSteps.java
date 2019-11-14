package br.com.ariadnemartines.Steps;

import org.openqa.selenium.By;

import br.com.ariadnemartines.Logic.Reservar1TicketLogic;
import br.com.ariadnemartines.Utils.Excel;
import br.com.ariadnemartines.Utils.Utils;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Reservar1TicketSteps extends Utils {
	
	private static Excel excel;
	private Reservar1TicketLogic reservar1TicketLogic;
	
	public Reservar1TicketSteps() throws Throwable {
		
		reservar1TicketLogic = new Reservar1TicketLogic();
	}
	
	private static Excel getExcel() {
		if(excel == null) {
			excel = new Excel(System.getProperty("user.dir") + "\\Recursos\\SampleAppData (3).xlsx");
		}
		return excel;
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
		Utils.evidencias();
	}

	@Given("^clico no botao 'Sign-In'$")
	public void clico_no_botao_Sign_In() throws Throwable {
		reservar1TicketLogic.clicarSignIn();
	}

	@Then("^seleciono a 'Quantidade de Passageiros' \"([^\"]*)\"$")
	public void seleciono_a_Quantidade_de_Passageiros(String passageiros) throws Throwable {
		reservar1TicketLogic.selecionarPassageiros(passageiros);
		Utils.evidencias();
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

	@Then("^seleciono o voo de ida em 'Depart' \"([^\"]*)\"$")
	public void seleciono_o_voo_de_ida_em_Depart(String voo) throws Throwable {
		Utils.evidencias();
		reservar1TicketLogic.clicarVooIda(voo);
	}

	@Then("^seleciono o voo de retorno em 'Return' \"([^\"]*)\"$")
	public void seleciono_o_voo_de_retorno_em_Return(String retorno) throws Throwable {
		reservar1TicketLogic.clicarVooRetorno(retorno);
		Utils.evidencias();
	}

	@Then("^clico em 'Continue' Select Flight$")
	public void clico_em_Continue_Select_Flight() throws Throwable {
	    reservar1TicketLogic.clicarContinueFlight();
	}

	@Then("^preencho o 'First Name' \"([^\"]*)\"$")
	public void preencho_o_First_Name(String first) throws Throwable {
		Utils.evidencias();
		reservar1TicketLogic.preenncherFirstName(first);
	}

	@Then("^preencho o 'Last Name' \"([^\"]*)\"$")
	public void preencho_o_Last_Name(String last) throws Throwable {
		reservar1TicketLogic.preencherLastName(last);
		Utils.evidencias();
	}

	@Then("^preencho o 'Numero do Cartao' \"([^\"]*)\"$")
	public void preencho_o_Numero_do_Cartao(String number) throws Throwable {
		reservar1TicketLogic.preencherNumeroCartao(number);
	}

	@Then("^clico em 'Secure Purchase'$")
	public void clico_em_Secure_Purchase() throws Throwable {
		reservar1TicketLogic.clicarSecurePurchase();
		Utils.evidencias();
	}

	@Given("^valido as informacoes da planilha \"([^\"]*)\"$")
	public void valido_as_informacoes_da_planilha(String arg1) throws Throwable {
	}

	@Then("^seleciono a 'Quantidade de Passageiros' na planilha excel \"([^\"]*)\"$")
	public void seleciono_a_Quantidade_de_Passageiros_na_planilha_excel(String linha) throws Throwable {
		String massa =getExcel().getTextoCelula(Integer.parseInt(linha), 1); // linha do bdd e coluna 2
		System.out.println("Quantidade de Passageiros: " + massa);
		reservar1TicketLogic.selecionarPassageiros(massa);
	}
	
	@Then("^seleciono a 'Cidade de Origem' na planilha excel \"([^\"]*)\"$")
	public void seleciono_a_Cidade_de_Origem_na_planilha_excel(String linha) throws Throwable {
		String massa =getExcel().getTextoCelula(Integer.parseInt(linha), 4); // linha do bdd e coluna 5
		System.out.println("Cidade de Origem: " + massa);
		reservar1TicketLogic.selecionarCidadeOrigem(massa);
	}
	
	@Then("^seleciono o 'Mes de Partida' na planilha excel \"([^\"]*)\"$")
	public void seleciono_o_Mes_de_Partida_na_planilha_excel(String linha) throws Throwable {
		String massa = getExcel().getTextoCelula(Integer.parseInt(linha), 3); // linha do bdd e coluna 4
		System.out.println("Mes: " + massa);
		reservar1TicketLogic.selecionarMesPartida(massa.split("[/]")[1]);
	}

	@Then("^seleciono o 'Dia da Partida' na planilha excel \"([^\"]*)\"$")
	public void seleciono_o_Dia_da_Partida_na_planilha_excel(String linha) throws Throwable {
		String massa = getExcel().getTextoCelula(Integer.parseInt(linha), 3); // linha do bdd e coluna 4
		System.out.println("Data: " + massa);
		reservar1TicketLogic.selecionarDiaPartida(massa.split("[/]")[0]);

	}
	
	
	@Then("^seleciono a 'Cidade de Destino' na planilha excel \"([^\"]*)\"$")
	public void seleciono_a_Cidade_de_Destino_na_planilha_excel(String linha) throws Throwable {
		String massa =getExcel().getTextoCelula(Integer.parseInt(linha), 5); // linha do bdd e coluna 6
		System.out.println("Cidade de Origem: " + massa);
		reservar1TicketLogic.selecionarCidadeRetorno(massa);
	}
	
	@Then("^seleciono a 'Classe de Servicos' na planilha excel \"([^\"]*)\"$")
	public void seleciono_a_Classe_de_Servicos_na_planilha_excel(String linha) throws Throwable {
		String massa =getExcel().getTextoCelula(Integer.parseInt(linha), 2); // linha do bdd e coluna 3
		System.out.println("Classe de Servicos: " + massa);
		reservar1TicketLogic.selecionarClasseDeServicos(massa);
	}
	
	@Then("^seleciono o 'Voo de Partida' na planilha excel \"([^\"]*)\"$")
	public void seleciono_o_Voo_de_Partida_na_planilha_excel(String linha) throws Throwable {
		String massa =getExcel().getTextoCelula(Integer.parseInt(linha), 0); // linha do bdd e coluna 1
		System.out.println("Voo de Partida: " + massa);
		reservar1TicketLogic.clicarVooIda(massa);
	}
	
	@Then("^gravo na planilha excel a 'Ordem Gerada' \"([^\"]*)\"$")
	public void gravo_na_planilha_excel_a_Ordem_Gerada(String linha) throws Throwable {
		String ordem = reservar1TicketLogic.gravarOrdemGerada();
		getExcel().setTextoCelula(Integer.parseInt(linha), 6, ordem);
	}
}
