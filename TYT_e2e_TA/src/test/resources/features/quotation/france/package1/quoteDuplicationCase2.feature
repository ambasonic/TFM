# new feature
# Tags: optional
@france
@pck1case2france
Feature: Quotation Duplication with an existing Customer France (change of duration and distance)

  Scenario Outline: quote duplication
    Given The dealer open the MilesWeb backoffice '<country>'
    And he login
    Then he can see the dealer home page
    When he select the pending quotes menu
    Then he can duplicate a quote
    And he clicks on option tab
    And he selects the option pack '<optionPack>'
    And he clicks on Finance tab
    And he updates the duration <duration>
    And he updates the distance <distance>
    Then he calculates the quote
    And he check the total price '<totalPrice>'
    And he checks the selected option price '<optionPack>' '<optionPack Price>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he scrolls down for credit request
    And he saved it
#    Then he sends the credit request
#    Then he accepts the prospect agreement

    Examples:
     |country |duration| distance |optionPack        |option                 |totalPrice|optionPack Price| optionPrice|
     |france |60      | 120000   | Pack Confort Plus|Space saver spare wheel|€ 275,88   |€ 600,00        |€ 150,00|