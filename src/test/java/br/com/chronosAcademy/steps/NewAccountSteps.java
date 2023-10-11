package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.pages.NewAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class NewAccountSteps {
    NewAccountPage newAccountPage;

    @Dado("que a pagina new account esteja sendo exibida")
    public void queAPaginaNewAccountEstejaSendoExibida(){

    }
    @Quando("os campos de cadastro estiverem preenchidos com")
    public void osCamposDeCadastroEstiveremPreenchidosCom(io.cucumber.datatable.DataTable dataTable){

    }

    @Entao("deve ser possivel logar no sistema apos o cadastro")
    public void deveSerPossivelLogarNoSistemaAposOCadastro(){

    }
}
