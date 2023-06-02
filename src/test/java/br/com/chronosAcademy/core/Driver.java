package br.com.chronosAcademy.core;

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
    public Driver(String navegador){

        //chrome, ie, firefox, edge
        switch (navegador){
            case "chrome" :
                WebDriverManager.chromedriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
                driver = new ChromeDriver(); //ele que abre o navagador
                break;
            case "ie":
                WebDriverManager.iedriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
                driver = new InternetExplorerDriver(); //ele que abre o navagador
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
                driver = new FirefoxDriver(); //ele que abre o navagador
                break;
            case "edge":
                WebDriverManager.edgedriver().setup(); //vai baixar e fazer tudo - webdriverManager eh uma classe
                driver = new EdgeDriver(); //ele que abre o navagador
                break;
            default:

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

    public static WebDriver getDriver(){
        return driver;
    }
}
