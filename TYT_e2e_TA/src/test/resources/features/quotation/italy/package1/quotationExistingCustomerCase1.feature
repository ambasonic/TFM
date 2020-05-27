# new feature
# Tags: optional
@italy
@pck1case1
Feature: Quotation Template with an existing Customer Italy

  Scenario Outline: quotation
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
    And he saved it
    Then he sends the credit request
    And he accepts the prospect agreement
    Then he prints documents
#    And he log out

    Examples:
      | car manufacturer| model | car type                                 | color                    | upholstery       |accessories    | customer Name | duration | distance | paymentIndex | paymentMethod                                          |
      | Toyota          | Yaris | 1.5 Hybrid Lounge Red/Bronze MY19 (2019) | Red Mica&Black metallic  | Cloth black/grey | lojack classic| Cifelli       | 48       | 80000    | 1            |TFM2_Delivery cost direct/broker from dealer to customer|