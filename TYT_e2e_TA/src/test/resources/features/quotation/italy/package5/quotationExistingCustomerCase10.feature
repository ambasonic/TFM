# new feature
# Tags: optional
@italy
@pck5case10
Feature: Quotation Template with an existing Customer Italy including PickUp and Delivery(Service)

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
    And he selects an option '<option>'
    And he selects an option '<option2>'
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
    And he adds the service '<service>' '<service_option>'
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he check the service price '<servicePrice>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<option2>' '<option2Price>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model  | car type                          | color                    | upholstery                                     |option         |option2        | accessories          |customer Name        | duration|distance|paymentIndex | paymentMethod                                          |downPayment|service             |service_option    |leasePrice|servicePrice|optionPrice |option2Price|accessoriesPrice|
      | Lexus           | NX     |   Hybrid Luxury 4WD (2020)        | White pearl              | Dark Rose Luxury Leather with Shimamoku insert |Metallic paint |Panoramic roof | LoJack Classic       |CHIMAR SPA           |     48  | 60000  |1            |TFM2_Delivery cost direct/broker from dealer to customer|7000       | PickUp and Delivery|   yes            | € 750.97 | € 224.94   |€ 1,150.00  |€ 600.00    |€ 189.10        |