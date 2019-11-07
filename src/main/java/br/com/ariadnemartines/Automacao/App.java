package br.com.ariadnemartines.Automacao;

import org.junit.Test;

import br.com.ariadnemartines.Driver.Driver;

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
    //	Utils.espera(5); // em segundos
    	try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	Driver.encerraDriver();
    }
    
    
}
