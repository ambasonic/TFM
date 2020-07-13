@france
@pck2case2france
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
    And he selects an option '<option>'
    And he selects an option '<option2>'
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he go to the next page
    Then he search the customer by name '<customer Name>'
    And he go to the next page
    Then he accepts the prospect agreement
    And he sets the product to '<product_type>'
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he scrolls down
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds at index 0 '<tyreNumber>' tires
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<option2>' '<optionPrice2>'
    And he clicks on the financial summary panel
    And he scrolls down
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model   | car type                             | color                  | upholstery          |option         |option2                              | customer Name  | product_type        | duration | distance   |tyreIndex | tyreName     | tyreNumber |leasePrice|optionPrice|optionPrice2|
      | Toyota          | COROLLA | Hybride 122h Dynamic Business (2020) | Black metallic paint   | Sellerie tissu Noir |Metallic paint | Front radar parking distance sensors|2BDEVELOPPEMENT | KINTO ONE DECALAGE  |60        | 120000     |     0    | Summer Tires |       4    |€ 409,47  |€ 650,00   |€ 280,00    |