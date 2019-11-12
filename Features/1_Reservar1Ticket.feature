Feature: Reservar 1 ticket

  Scenario Outline:  Reservar 1 ticket
  
  Given que acesso o site "<url>"
  And preencho o campo 'Nome de Usuario' "<usuario>"
  And preencho a 'Senha' "<senha>"
  And clico no botao 'Sign-In' 
  Then seleciono a 'Quantidade de Passageiros' "<passageiros>"
  And seleciono a cidade de origem 'Departing From' "<cidadeDeOrigem>"
  And seleciono o 'Mes de Partida' "<mesDePatida>" 
  And seleciono a 'Dia de Partida' "<diaDePartida>"
  And seleciono a cidade de destino 'Arriving In' "<cidadeDeDestino>"
  And seleciono o 'Mes de Retorno' "<mesDeRetorno>"
  And seleciono o 'Dia de Retorno' "<diaDeRetorno>"  
  And seleciono a 'Classe de Servico' 
  And clico no botao 'Continue'
  And seleciono o voo de ida em 'Depart'
  And seleciono o voo de retorno em 'Return'
  And clico em 'Continue' Select Flight
  Then preencho o 'First Name' "<firstName>"
  And preencho o 'Last Name' "<lastName>"
  And preencho o 'Numero do Cartao' "<number>"
  And clico em 'Secure Purchase'
  
  Examples:
  
  |              url                 | usuario | senha   | passageiros | cidadeDeOrigem | mesDePatida | diaDePartida | cidadeDeDestino | mesDeRetorno | diaDeRetorno | firstName | lastName |        number     |
  | http://www.newtours.demoaut.com/ | mercury | mercury |     1       |     Paris      |  December   |      12      |    Seattle      |    January   |      5       |  Ariadne  | Martines | 1234567890123456  |