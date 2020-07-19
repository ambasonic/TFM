# new feature
# Tags: optional
@italy
@pck7case15
Feature: Quotation Template with an existing Private Customer Italy including Downpayment and Relief Vehicle

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'ITALY'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    Then he sets the customer as 'Private'
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects an option '<option>'
    And he selects the accessories '<accessories>'
    And he go to the next page
    Then he search the customer by name '<customer Name>'
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
    And he check the service price '<servicePrice>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model | car type                           | color              | upholstery       |option            | accessories    |customer Name     |duration |distance | paymentIndex |                   paymentMethod                        |downPayment |relief_vehicle| insurance                             |leasePrice |servicePrice|accessoriesPrice|optionPrice|
      | Toyota          | Yaris | 1.5 Hybrid Active Plus MY19 (2019) | Super White gloss  | Cloth black/grey |Super White paint | LoJack Classic |Bresciani, Andrea |36       |40000    |      1       |TFM2_Delivery cost direct/broker from dealer to customer|   4000     |yes           |Anti-Theft LoJack Abbonamento > 34 mesi| € 187.86  |€ 138.22    | € 189.10       |€ 450.00   |