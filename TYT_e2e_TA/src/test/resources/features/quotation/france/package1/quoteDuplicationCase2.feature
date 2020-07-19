# new feature
# Tags: optional
@france
@pck1case2france
Feature: Quotation Duplication with an existing Customer France (change of duration and distance)

  Scenario Outline: quote duplication
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
    And The dealer open the MilesWeb backoffice '<country>'
    And he login
    Then he can see the dealer home page
    When he select the pending quotes menu
    Then he can duplicate a quote
    And he clicks on option tab
    And he selects the option pack '<optionPack>'
    And he clicks on Finance tab
    And he updates the duration <duration2>
    And he updates the distance <distance2>
    Then he calculates the quote
    And he check the total price '<totalPrice2>'
    And he checks the selected option price '<optionPack>' '<optionPack Price>'
    And he checks the selected option price '<option2>' '<optionPrice2>'
    And he scrolls down for credit request
    And he saved it
    And he scrolls down for credit request
    Then he sends the credit request
    Then he accepts the prospect agreement from credit request
#    And he prints the document
    Examples:
      |country| car manufacturer| model         | car type                               | color                    | upholstery       |option                 | customer Name  | product_type| duration | distance |totalPrice|optionPrice|duration2| distance2 |optionPack        |option2                |totalPrice2|optionPack Price| optionPrice2|
      |france | Toyota          | Yaris Hybride | 1.5 VVT-I HYBRID France Business (2019)| Pure White gloss paint   | Cloth Black/Grey |Space saver spare wheel| 2BDEVELOPPEMENT| KINTO ONE   |48        | 80000    |€ 260,29  |€ 150,00   |60       | 120000    | Pack Confort Plus|Space saver spare wheel|€ 275,88   |€ 600,00        |€ 150,00    |