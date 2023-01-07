package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.maps.PrincipalMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class PrincipalPage {

    WebDriver driver;
    PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap); //inicializar os objetos do principalPage
        //PageFactory.initElements(driver, this); //o this seria usado se os elementos estivessem nessa classe do principal page
    }

    public String getTitulo() {
        return principalMap.txtTitulo.getText();
    }

    public void clickBotao() {
        principalMap.btnTitulo.click();
    }
}