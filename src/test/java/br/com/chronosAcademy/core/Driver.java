package br.com.chronosAcademy.core;

import br.com.chronosAcademy.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    private static WebDriverWait wait;

    //se alguém quiser usar, precisa inicializar, instanciar...CONSTRUTOR
    public Driver(Browser navegador){

        //chrome, ie, firefox, edge
        switch (navegador){
            case CHROME:
                WebDriverManager.chromedriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
                driver = new ChromeDriver(); //ele que abre o navagador
                break;
            case IE:
                WebDriverManager.iedriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
                driver = new InternetExplorerDriver(); //ele que abre o navagador
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
                driver = new FirefoxDriver(); //ele que abre o navagador
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
                driver = new EdgeDriver(); //ele que abre o navagador
                break;
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public static void visibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void invisibilityOf(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void attributeChange(WebElement element, String attribute, String value){
     wait.until(ExpectedConditions.attributeContains(element,attribute,value));
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
