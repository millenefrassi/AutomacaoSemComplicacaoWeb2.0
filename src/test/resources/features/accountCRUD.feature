#language:pt
Funcionalidade: Account CRUD

  @cadastroConta
  Cenario: Cadastro nova conta
    Dado que a pagina new account esteja sendo exibida
    Quando os campos de cadastro estiverem preenchidos com
      | username | chronosTesteQAMi              |
      | email    | chronostesteqami@email.com.br |
      | password | Senha123                      |
      | country  | Brazil                        |
    Entao deve ser possivel logar no sistema apos o cadastro

  @loginCRUD
  Cenario: Realizar login CRUD
    Dado que o modal esteja sendo exibida
    Quando os campos de login forem preenchidos da seguinte forma
      | login    | chronosTesteQAMi |
      | password | Senha123         |
      | remember | false            |
    Quando for realizado um clique no botao sign in
    Entao deve ser possivel logar no sistema

  @alteracaoCRUD
  Cenario: Realizar alteracao conta
    Dado que esteja logado no sistema com
      | login    | chronosTesteQAMi |
      | password | Senha123         |
      | remember | false            |
    Dado que esteja na pagina de alteracao de conta
    Quando altero os valores dos seguintes campos
    | firstName | Chronos |
    | lastName  | teste   |
    Quando for realizado o click em salvar
    Entao a alteracao foi exibida na pagina myAccount

    @exclusaoCRUD
    Cenario: Deletar usuario
      Dado que esteja logado no sistema com
        | login    | chronosTesteQAMi |
        | password | Senha123         |
        | remember | false            |
      Dado que esteja na pagina myAccount
      Quando for efetuado a acao do clique delete e em yes
      Entao o usuario deve ser deletado




