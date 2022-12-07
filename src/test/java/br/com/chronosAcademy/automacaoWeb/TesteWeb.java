package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    @Test
    public void primeiroTeste(){
        WebDriverManager.chromedriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
        ChromeDriver driver;

        driver = new ChromeDriver(); //ele que abre o navagador
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);
        //driver.close(); //fecha só janela, mas o driver ainda continua executando em segundo plano
        driver.quit(); //fecha tudo janela e driver

    }
}
