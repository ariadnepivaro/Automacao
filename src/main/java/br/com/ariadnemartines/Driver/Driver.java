package br.com.ariadnemartines.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.math.Quantiles;

public class Driver {
	private static WebDriver driver = null;

	public Driver() {}
	
	public static WebDriver getWebDriver() {
		if(driver == null) {
    		driver = newChromeDriver();
    		//driver = newInternetExplorerDriver();
    	}
		return driver;
	}
	
    public static void getWebPage(String url) {
    	getWebDriver().manage().window().maximize();
    	getWebDriver().get(url);
    }

	private static WebDriver newChromeDriver() {
		System.out.println("abriu: "+ System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		return new ChromeDriver();
	}
	
	public static void encerraDriver() {
		if (driver != null) { // se estiver inicializado
			getWebDriver().quit(); // fecha
			driver=null;
		}
	}
}