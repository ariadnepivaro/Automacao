package br.com.ariadnemartines.Utils;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import br.com.ariadnemartines.Automacao.Inicio_Termino;
import br.com.ariadnemartines.Driver.Driver;

public class Utils extends Driver {
	
	private WebElement elemento;
	private static int i;
	
	public Utils() {
		i = 1;
	}

	public static void esperaAteElementoEstarClicavel(By element) {
		try {
			Driver.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println("Elemento nao esta clicavel");
		}	
	}

	public static void esperaEmSegundos(int i) {
		try {
			Thread.sleep(i*1000);
		} catch (Exception e) {
		}
	}
	
	public void preencherTexto(WebDriver driver, By by, String texto) {
		elemento = driver.findElement(by);
		if(elemento.isDisplayed())
			elemento.sendKeys(texto);
		else
			assertTrue("O elemento " + elemento.getAttribute("Name") + " não existe", false);
	}
	
	public void clicarBotao(WebDriver driver, By by) {
		elemento = driver.findElement(by);
		if(elemento.isDisplayed())
			elemento.click();
		else
			assertTrue("O elemento " + elemento.getAttribute("Name") + " não existe", false);
	}
	
	public void selecionaListBox(WebDriver driver, By by, String opcao) {
		elemento = driver.findElement(by);
		Select options = new Select(elemento);
		if(elemento.isDisplayed())
			options.selectByVisibleText(opcao);			
		else
			assertTrue("O elemento " + elemento.getAttribute("Name") + " não existe", false);
	}
	
	public void clicaRadioButton(WebDriver driver, By by) {
		elemento = driver.findElement(by);
		if(elemento.isEnabled())
			elemento.click();
		else
			assertTrue("O elemento " + elemento.getAttribute("Name") + " não existe", false);
	}
	
	public static void evidencias() {
		try {
			TakesScreenshot source = (TakesScreenshot) getWebDriver();
			File scr = source.getScreenshotAs(OutputType.FILE);
			File imagem = new File(System.getProperty("user.dir") + "\\Evidencias\\"+ Inicio_Termino.getNomeDoCenario() +"\\evidencia_" + i++ + ".png");
			FileUtils.copyFile(scr, imagem);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
