Feature: Consultas en SUNAT

  Scenario: Realizar consultas por RUC
    Given que se carga la pagina de SUNAT
    When se busca a persona juridica por RUC
    Then se valida la consulta por RUC

  Scenario: Realizar consulta por Razon Social
    Given que se carga la pagina de SUNAT
    When se busca a persona juridica pór Razon Social
    Then se valida la consulta por Razon Social