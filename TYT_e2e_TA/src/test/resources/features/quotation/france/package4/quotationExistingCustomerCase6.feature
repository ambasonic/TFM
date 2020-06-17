# new feature
# Tags: optional
@france
@pck4case6france
Feature: Quotation Template with an existing Customer France including relief vehicle

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
    Then he search the customer by name '<customer Name>'
    And he go to the next page
    Then he accepts the prospect agreement
    And he sets the product to '<product_type>'
    And he go to the next page
    And he scrolls down
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he adds the service '<tires>' '<tire choice>'
    And he adds at index 0 '<tyreNumber>' tires
    And he adds the service '<relief vehicle>' '<relief vehicle choice>'
    And he scrolls down for credit request
    Then he calculates the quote
    And he check the lease price '<lease price>'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '<optionPrice>'
    And he clicks on the financial summary panel
    And he scrolls down for credit request
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model   | car type                | color                   | upholstery                                                             |option            | customer Name  | product_type  | duration | distance  |tires | tire choice        |tyreNumber |relief vehicle choice|relief vehicle|lease price|optionPrice|
      | Toyota          | AYGO    | 1.0 VVT-i x-play (2019) | Red Chilien gloss paint | Cloth upholstery Dark Grey with bi-toned bolsters white and light grey |Chilien Red paint |2BDEVELOPPEMENT | KINTO ONE     |48        | 90000     |tires | 4-Seasons Tires    |     8     |yes                  |relief vehicle|€ 251,58   |€ 250,00   |