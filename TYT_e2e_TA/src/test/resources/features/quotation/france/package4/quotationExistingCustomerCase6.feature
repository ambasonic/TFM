# new feature
# Tags: optional
@france
@pck4case6
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
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds at index 2 '<tyreNumber>' tires
    Then he calculates the quote
    And he saved it
    And he log out
# retirer tous les index tyreIndex, tyreNumberIndex
    Examples:
      | car manufacturer| model   | car type                | color                   | upholstery                                                             |option            | customer Name  | product_type  | duration | distance  |tyreIndex | tyreName        |tyreNumber |
      | Toyota          | AYGO    | 1.0 VVT-i x-play (2019) | Red Chilien gloss paint | Cloth upholstery Dark Grey with bi-toned bolsters white and light grey |Chilien Red paint |2BDEVELOPPEMENT | KINTO ONE     |90        | 48000     |     2    | 4-Seasons Tires |     4     |