Feature: Criar Massa de Dados Reserva

  Scenario Outline: Criar Massa de Dados Reserva
    Given que acesso o site "<url>"
    And preencho o campo 'Nome de Usuario' "<usuario>"
    And preencho a 'Senha' "<senha>"
    And clico no botao 'Sign-In'
    And seleciono a 'Quantidade de Passageiros' na planilha excel "<linha>"
    Then seleciono a 'Cidade de Origem' na planilha excel "<linha>"
    And seleciono o 'Mes de Partida' na planilha excel "<linha>"
    And seleciono o 'Dia da Partida' na planilha excel "<linha>"
    And seleciono a 'Cidade de Destino' na planilha excel "<linha>"
    And seleciono o 'Mes de Retorno' "<mesDeRetorno>"
    And seleciono o 'Dia de Retorno' "<diaDeRetorno>"
    And seleciono a 'Classe de Servicos' na planilha excel "<linha>"
    And clico no botao 'Continue'
    And seleciono o 'Voo de Partida' na planilha excel "<linha>"
    And seleciono o voo de retorno em 'Return' "<retorno>"
    And clico em 'Continue' Select Flight
    Then preencho o 'First Name' "<firstName>"
    And preencho o 'Last Name' "<lastName>"
    And preencho o 'Numero do Cartao' "<number>"
    And clico em 'Secure Purchase'
    And gravo na planilha excel a 'Ordem Gerada' "<linha>"

    Examples: 
      | linha | url                              | usuario | senha   | mesDeRetorno | diaDeRetorno | retorno              | firstName | lastName | number           |
      |   1   | http://www.newtours.demoaut.com/ | mercury | mercury | January      |      10      | Unified Airlines 633 | Ariadne   | Martines | 1234567890123456 |
      |	  2   | http://www.newtours.demoaut.com/ | mercury | mercury |    November  |      11      | Unified Airlines 633 | Ariadne   | Martines | 1234567890123456  |
