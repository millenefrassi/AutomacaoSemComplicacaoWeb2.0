package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

//Anotacoes Junit
//@Test - utilizado para determinar que o método é um teste... sempre antes ou acima do metodos
//@Ignore - Anotacao para que o teste nao seja executado. Deve ser antes da anotacao @teste
//@After - anotacao utilizada nos metodos que devem ser executados ao final de cada teste
//@Before - anotacao utilizada nos metodos que devem ser realizados ao inicio de CADA teste
//@BeforeClass - anotacao utilizada nos metodos que devem ser realizados antes de TODOS os testes da classe
//@AfterClass - anotacao utilizada nos metodos que devem ser realizados depois de todos os testes de classe
//@RunWith - anotacao utilizada para criar uma suite de teste

public class TesteWeb {

    WebDriver driver; //objeto global... qq metodo vai enxergar a variavel
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver(); //ele que abre o navagador
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }

    @Test
    public void primeiroTeste(){

        String xpathTitulo = "//section[2]//h4";
        // --//section[2]/div[3]/div/div/div/div/div[1]/div/h4
        // -- //section[2]//h4
        // -- /html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);


    }

    @After
    public void finalizaTeste(){
        //driver.close(); //fecha só janela, mas o driver ainda continua executando em segundo plano
        driver.quit(); //fecha tudo janela e driver
    }
}
