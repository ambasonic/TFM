# new feature
# Tags: optional

@italy
@pck1case2
Feature: Duplicate a quote and change of duration and distance with additional options

  Scenario Outline: quote duplication
    Given The dealer open the MilesWeb portal Dealer home page
    And he login
    Then he can see the dealer home page
    When he select the pending quotes menu
    Then he can duplicate a quote
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he sets relief vehicle to '<relief_vehicle>'
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds <tyreNumber> tires
    Then he calculates the quote
    And he check the total price '<totalPrice>'
    And he saved it

    Examples:
      |duration| distance | paymentIndex | paymentMethod | relief_vehicle | tyreIndex | tyreName | tyreNumber | totalPrice |
      |60      | 190000   | 1            |TFM2_Delivery cost direct/broker from dealer to customer| yes | 2 | Flex Standard | 4 |€ 535.91 |