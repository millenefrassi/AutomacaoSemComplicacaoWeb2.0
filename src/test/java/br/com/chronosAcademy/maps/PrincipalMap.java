package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalMap {
    @FindBy(xpath = "//section[2]//h4")
    public WebElement txtTitulo;

    @FindBy(xpath = "//section[2]/div[3]//a")
    public WebElement btnTitulo;


    //jeitos de escrever o xpath
    //String xpathTitulo = "//section[2]//h4";
    // --//section[2]/div[3]/div/div/div/div/div[1]/div/h4
    // -- //section[2]//h4
    // -- /html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4
}
