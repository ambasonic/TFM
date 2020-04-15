# new feature
# Tags: optional
@italy
Feature: Quotation Template with an existing Customer Italy

  Scenario Outline: quotation
    Given The dealer open the MilesWeb portal Dealer home page
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects an option '<description>'
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
    And he log out


    Examples:
      | car manufacturer| model| car type | color | upholstery |description | customer Name | duration | distance | paymentIndex | paymentMethod |
      | Toyota | Yaris | 1.0 VVT-i x-play | Anthracite Grey metallic | Cloth upholstery Dark Grey with bi-toned bolsters white and light grey | lojack classic| ANNA PAGANO | 48 | 80000 | 1 |TFM2_Delivery cost direct/broker from dealer to customer|