#language: en

  Feature: Abrir la pagina web de assetmaker

    Yo como usuario de assetmaker
    Quiero abrir la pagina web
    Para poder ver los servicios que ofrece

    Scenario: Abrir con el navegador chrome la pagina de assetmaker
      Given que estoy en la pagina web de assetmaker
      When abro la pagina web de assetmaker
      Then veo el titulo de la pagina web de assetmaker