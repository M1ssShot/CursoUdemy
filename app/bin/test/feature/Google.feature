@GoogleTest
Feature: Probar la busqueda en google

#Si no voy a usar variables en mi Scenario uso la etiqueta Scenario
#Si voy a usar un Scenario con varibles tengo que usar la etiqueda Scenario Outline
Scenario Outline: Busco algo en google
    Given i'm on the google page
    When i enter a search <search>
    And Click on the search button
    Then the results match the criteria

#Para dar valores  a los campos o en este caso elementos uso la etiqueda Examples
#Cada la tabla de disenhia con este caracter | para encerrar los valores como una tabla literalmente
Examples:
    |search|
    |League of Legends|
    |Overlord|
    |Youtube|
