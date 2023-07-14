package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.enums.Browser;
import br.com.chronosAcademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage;
    @Before
    public void iniciaNavegador(){
        new Driver(Browser.CHROME);
    }

    @After
    public void fechaNavegador(){
        Driver.getDriver().quit(); //close fecha só o navegador mas não fecha o driver ocupando espaco na memoria
    }

    @Dado("que o modal esteja sendo exibida")
    public void queOModalEstejaSendoExibida() {
        //System.out.println("entrou aqui");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        Driver.getDriver().get("https://advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.divFecharModal();
    }
    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try {
            loginPage.invisibilityOfBtnFechar();
        } catch (Exception e) {
            throw new Exception("A janela modal nao foi fechada.");
        }
    }


    @Quando("for realizado um clique no icone fechar")
    public void forRealizadoUmCliqueNoIconeFechar() {
        loginPage.clickBtnFechar();

    }

    @Quando("for realizado um clique no link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Entao("a pagina Create New Account deve ser exibida")
    public void aPaginaCreateNewAccountDeveSerExibida() {

    }

    @Quando("os campos de login forem preenchidos da seguinte forma")
    public void osCamposDeLoginForemPreenchidosDaSeguinteForma(Map<String, String> map) {

        String username = map.get("login");
        String password = map.get("password");
        Boolean remember = Boolean.parseBoolean(map.get("remember"));

        loginPage.setInpUserName(username);
        loginPage.setInpPassword(password);

        if(remember)loginPage.clickInpRemember();
    }

    @Quando("for realizado um clique no botao sign in")
    public void forRealizadoUmCliqueNoBotaoSignIn() {
        loginPage.clickSignIn();

    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {

    }

    @Entao("o sistema deve exibir uma mensagem de erro")
    public void oSistemaDeveExibirUmaMensagemDeErro() {
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }
}
