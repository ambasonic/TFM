# new feature
# Tags: optional
@italy
@pck4case8
Feature: Quotation Template with an existing Customer Italy including Relief Vehicle

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
    And he selects an option from popUp Menu
    And he selects the accessories '<accessories>'
    And he selects the accessories '<accessories2>'
    And he go to the next page
    Then he search the customer by name '<customer Name>'
    And he go to the next page
    Then he accepts the prospect agreement 'Geo-Localization', 'Marketing purposes','Surveys'
    And he go to the next page
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he accepts the Fuel Card Edenred '<Fuel Card EdenRed>'
    And he sets relief vehicle to '<relief_vehicle>'
    Then he calculates the quote
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he checks the selected option price '<accessories2>' '<accessories2Price>'
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model | car type                          | color                    | upholstery       |option         | accessories    | accessories2|customer Name |paymentIndex | paymentMethod                                          |relief_vehicle |Fuel Card EdenRed |optionPrice |accessoriesPrice|accessories2Price|
      | Toyota          | Yaris |   1.5 Hybrid Active MY19 (2019)   | Black Metallic           | Cloth black/grey |Metallic paint | LoJack Premium | Portabici Sx|BOMI          |1            |TFM2_Delivery cost direct/broker from dealer to customer|    yes        |yes               |€ 700.00    |€ 272.06        |€ 161.22         |