package br.com.ariadnemartines.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.ariadnemartines.Driver.Driver;

public class Utils extends Driver {
	
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
	
	
	
	
	
	
	
	
}
