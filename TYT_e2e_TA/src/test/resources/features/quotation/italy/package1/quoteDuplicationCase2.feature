# new feature
# Tags: optional
@italy
@pck1case2
Feature: Duplicate a quote and change of duration and distance with additional options

  Scenario Outline: quote duplication
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
    And he go to the next page
    Then he accepts the prospect agreement
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he check the service price '<servicePrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he saved it
    And he log out
    And he login
    Then he can see the dealer home page
    When he select the pending quotes menu
    Then he can duplicate a quote
    And he updates the duration <duration2>
    And he updates the distance <distance2>
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he sets relief vehicle to '<relief_vehicle>'
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds at index 1 '<tyreNumber>' tires
    And he scrolls up
    Then he calculates the quote
    And he check the total price '<totalPrice>'
    And he saved it

    Examples:
      | car manufacturer| model | car type                                 | color                    | upholstery       |accessories    | customer Name | duration | distance | paymentIndex | paymentMethod                                          |leasePrice|servicePrice|accessoriesPrice||duration2| distance2 | paymentIndex | relief_vehicle | tyreIndex | tyreName      | tyreNumber | totalPrice |
      | Toyota          | Yaris | 1.5 Hybrid Lounge Red/Bronze MY19 (2019) | Red Mica&Black metallic  | Cloth black/grey | LoJack Classic| Cifelli       | 48       | 80000    | 1            |TFM2_Delivery cost direct/broker from dealer to customer| € 416.62 | € 158.72   | € 189.10       ||60       | 190000    | 1            | yes            | 2         | Flex Standard | 4          |€ 429.78    |