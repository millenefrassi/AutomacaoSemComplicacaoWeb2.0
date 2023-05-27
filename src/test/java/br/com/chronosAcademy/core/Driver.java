package br.com.chronosAcademy.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    private static WebDriver driver;

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
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
