# new feature
# Tags: optional
@france
@pck1case2france
Feature: Quotation Duplication with an existing Customer France (change of duration and distance)
#Duplication
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
    Then he calculates the quote
    And he check the lease price '€ 261,04'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '€ 150,00'
    And he clicks on the financial summary panel
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model         | car type                      | color                    | upholstery  |option                 | customer Name  | product_type| duration | distance |
      | Toyota          | Yaris Hybride | 1.5 VVT-I HYBRID France (2019)| Pure White gloss paint   | Cloth black |Space saver spare wheel| 2BDEVELOPPEMENT| KINTO ONE   |60        | 120000   |