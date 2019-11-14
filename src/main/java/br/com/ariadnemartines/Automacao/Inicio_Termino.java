package br.com.ariadnemartines.Automacao;

import br.com.ariadnemartines.Driver.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Inicio_Termino extends Driver{
	private static String nomeDoCenario;

	public static String getNomeDoCenario() {
		return nomeDoCenario;
	}
	@Before
	public void antesDoTeste(Scenario scenario) {
		System.out.println("Iniciando");
		nomeDoCenario = scenario.getName();
	}
	
	@After
	public void depoisDoTeste(Scenario scenario) {
		System.out.println("Finalizando");
		if(scenario.getStatus().equals("passed")) {
			System.out.println("Teste passou");
		}else {
			System.out.println("Teste não passou");
		}
		Driver.encerraDriver();
	}
}