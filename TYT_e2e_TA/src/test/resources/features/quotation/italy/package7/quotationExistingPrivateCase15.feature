# new feature
# Tags: optional
@italy
@pck7case15
Feature: Quotation Template with an existing private Customer Italy including Downpayment and relief vehicle

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'ITALY'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects the accessories '<accessories>'
    And he go to the next page
    Then he search the customer by name '<customer Name>'

    Examples:
      | car manufacturer| model | car type                    | color              | upholstery       |accessories    |Option           | customer Name |
      | Toyota          | Yaris | 1.5 Hybrid Active Plus MY19 | Super White gloss  | Cloth black/grey | lojack classic|Super white paint| BOMI          |