# new feature
# Tags: optional
@italy
@pck4case9
Feature: Quotation Template with a New Customer Italy including Relief Vehicle and Fuel card

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
    And he selects an option from popUp Menu '<description>'
    And he go to the next page

    Examples:
      | car manufacturer| model | car type                          | color                    | upholstery       |description    | customer Name | duration | distance | paymentIndex | paymentMethod                                          |relief_vehicle |
      | Toyota          | Yaris |   1.5 Hybrid Active MY19 (2019)   | Red Mica &Black Metalic  | Cloth black/grey | Portabici Sx  | BOMI          | 48       | 80000    | 1            |TFM2_Delivery cost direct/broker from dealer to customer|    yes        |