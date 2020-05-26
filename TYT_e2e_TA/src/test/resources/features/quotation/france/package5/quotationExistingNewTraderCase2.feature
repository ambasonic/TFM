# new feature
# Tags: optional

@france
@pck5case2
Feature: Quotation Template with an Existing Sole Trader France including Downpayment and relief vehicle

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'FRANCE'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he selects an option '<option>'
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he go to the next page

    Examples:
      | car manufacturer| model | car type         | color              | upholstery                   |option          |
      | Toyota          | YARIS | 450h Luxe (2020) | Gris Titane métal. |Sièges Cuir Noir Inserts Noir |Pack Technology |