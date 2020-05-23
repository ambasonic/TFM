# new feature
# Tags: optional
@italy
@pck7case16
Feature: Quotation Template with a private new Sole Trader Italy including Downpayment

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'ITALY'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects an option '<option>'
    And he selects the option pack '<optionPack>'
    And he selects the accessories '<accessories>'
    And he go to the next page
    Then he can create a new customer

    Examples:
      |manufacturer |model         |  car type                              |  color      |  upholstery    |  accessories  |        option         |  optionPack         |
      |Toyota       | Proace Verso |2.0D 150cv S&S M/T L2 D Lounge 9P.(2020)| White gloss | Dark grey cloth| Lojack Classic|Metallic or pearl paint| Premium Pack Fsport |