package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
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
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver(); //ele que abre o navagador
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");

        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void primeiroTeste(){

        String titulo = principalPage.getTitulo();
        assertEquals("Porque Tempo É Conhecimento", titulo);

    }



    @Test
    public void segundoTeste(){
        principalPage.clickBotao();
        cursoPage = new CursoPage(driver);

        String titulo = cursoPage.getTitulo2();
        assertEquals("Conheça todos os nossos cursos", titulo);

    }





    @After
    public void finalizaTeste(){
        //driver.close(); //fecha só janela, mas o driver ainda continua executando em segundo plano
        driver.quit(); //fecha tudo janela e driver
    }
}
