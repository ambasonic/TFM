# new feature
# Tags: optional

@italy
@pck2case2
Feature: Create a quotation with an existing Sole Trader including downpayment and relief vehicle

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'ITALY'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects the option pack '<optionPack>'
    And he selects the accessories '<accessories>'
    And he go to the next page
    Then he search the sole trader by name '<customer Name>'
    And he go to the next page
    Then he accepts the prospect agreement
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he gives a down payment of '<downPayment>'
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he set the insurance type '<insurance>'
    And he sets relief vehicle to '<relief_vehicle>'
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he checks the selected option price '<optionPack>' '<optionPackPrice>'
    And he saved it
    And he log out

    Examples:
      |manufacturer|  model  |            car type             |              color          |            upholstery         |  accessories  |    optionPack                |customer Name | duration|distance| paymentIndex |                   paymentMethod                        |downPayment|              insurance                |leasePrice|accessoriesPrice|optionPackPrice|relief_vehicle|
      |Toyota      |  C-HR   |1.8H (122CV) E-CVT Dynamic (2019)|Dark grey Met with black roof| Leather interior and Alcantara| LoJack Classic| Touch2 with Go Plus (no MY20)| CARINI       |    48   | 100000 |      1       |TFM2_Delivery cost direct/broker from dealer to customer|   5000    |Anti-Theft LoJack Abbonamento > 34 mesi|€ 393.50  | € 189.10       |€ 1,100.00     |      yes     |