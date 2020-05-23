# new feature
# Tags: optional

@italy
@pck7case14

Feature: Quotation Template with a private new Customer Italy including Downpayment

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
    And he selects the accessories '<accessories2>'
    And he go to the next page
    Then he can create a new customer

    Examples:
      |manufacturer|model|  car type      |  color      |  upholstery  |  accessories  |accessories2 |        option         |  optionPack         |
      |Lexus       | Rx  |450h F Executive| Cargo Green | Leather Ocher| Lojack premium|Portabici Sx |Metallic or pearl paint| Premium Pack Fsport |