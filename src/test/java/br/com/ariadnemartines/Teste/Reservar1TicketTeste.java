package br.com.ariadnemartines.Teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features/1_Reservar1Ticket.feature" }, glue = { "" }, plugin = {
		"pretty" }, monochrome = true, dryRun = false)
public class Reservar1TicketTeste {
}