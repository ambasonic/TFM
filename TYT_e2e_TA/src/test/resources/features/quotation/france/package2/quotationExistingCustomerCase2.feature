@france
@pck2case1
Feature: Quotation Duplication with an existing Customer France(change of duration and distance)

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
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects an option '<option>'
    And he go to the next page
    Then he search the customer by name '<customer Name>'
    And he go to the next page
    Then he accepts the prospect agreement
    And he sets the product to '<product_type>'
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds <tyreNumber> tires
    Then he calculates the quote
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model   | car type                             | color                  | upholstery          |option                                                 | customer Name  | product_type         | duration | distance  |tyreIndex | tyreName     | tyreNumber|
      | Toyota          | COROLLA | Hybride 122h Dynamic Business (2020) | Black metallic paint   | Sellerie tissu Noir |Metallic paint and Front radar parking distance sensors| 2BDEVELOPPEMENT| KINTO ONE DECALAGE   |60        | 120000    |     0    | Summer Tires |      4    |