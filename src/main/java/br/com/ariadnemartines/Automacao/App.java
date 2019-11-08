package br.com.ariadnemartines.Automacao;

import org.junit.Test;
import org.openqa.selenium.By;

import br.com.ariadnemartines.Driver.Driver;
import br.com.ariadnemartines.Utils.Utils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    @Test
    public void rodando() {
    	Driver.getWebPage("http://www.google.com.br");
    	Utils.esperaEmSegundos(5);
    	Utils.esperaAteElementoEstarClicavel(By.xpath("//*[@name='q']"));
    	
    	
    	Driver.encerraDriver();
    }
    
    
}
