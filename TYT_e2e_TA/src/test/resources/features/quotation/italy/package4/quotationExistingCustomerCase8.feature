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
    Then he accepts the prospect agreement
    And he go to the next page
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he adds the service '<Fuel Card EdenRed>' '<Fuel Card EdenRed choice>'
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he check the service price '<servicePrice>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he checks the selected option price '<accessories2>' '<accessories2Price>'
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model | car type                          | color            | upholstery       |option         | accessories    | accessories2|customer Name |paymentIndex | paymentMethod                                          |Fuel Card EdenRed|Fuel Card EdenRed choice |leasePrice|servicePrice|optionPrice |accessoriesPrice|accessories2Price|
      | Toyota          | Yaris |   1.5 Hybrid Active MY19 (2019)   | Silver metallic  | Cloth black/grey |Metallic paint | LoJack Premium | Portabici Sx|CHIMAR SPA    |1            |TFM2_Delivery cost direct/broker from dealer to customer|Fuel Card EdenRed|yes                      | € 285.30 | € 130.11   |€ 700.00    |€ 272.06        |€ 161.22         |