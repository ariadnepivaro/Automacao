Feature: Criar Massa de Dados Reserva

  Scenario Outline: Criar Massa de Dados Reserva
    Given que acesso o site "<url>"
    And preencho o campo 'Nome de Usuario' "<usuario>"
    And preencho a 'Senha' "<senha>"
    And clico no botao 'Sign-In'
    Then seleciono a 'Cidade de Origem' na planilha excel "<linha>"
    And seleciono o 'Dia da Partida' na planilha excel "<linha>"
    
    
    
    
    

    Examples: 
     | linha  |              url                 | usuario | senha   | passageiros | cidadeDeOrigem | mesDePatida | diaDePartida | cidadeDeDestino | mesDeRetorno | diaDeRetorno | firstName | lastName |        number     |
 		 |	  1   | http://www.newtours.demoaut.com/ | mercury | mercury |     1       |     Paris      |  December   |      12      |    Seattle      |    January   |      5       |  Ariadne  | Martines | 1234567890123456  |
	   |	  2   | http://www.newtours.demoaut.com/ | mercury | mercury |     2       |     Paris      |  December   |      12      |    Seattle      |    January   |      5       |  Ariadne  | Martines | 1234567890123456  |