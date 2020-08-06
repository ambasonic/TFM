# new feature
# Tags: optional
@france
@pck1case1france
Feature: Quotation Template with an existing Customer France

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice '<country>'
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
    And he check the total price '<totalPrice>'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '<optionPrice>'
    And he clicks on the financial summary panel
    And he saved it
    And he log out

    Examples:
      |country| car manufacturer| model         | car type                               | color                    | upholstery       |option                 | customer Name  | product_type| duration | distance |totalPrice|optionPrice|
      |france | Toyota          | Yaris Hybride | 1.5 VVT-I HYBRID France Business (2019)| Pure White gloss paint   | Cloth Black/Grey |Space saver spare wheel| 2BDEVELOPPEMENT| KINTO ONE   |48        | 80000    |€ 260,29  |€ 150,00|