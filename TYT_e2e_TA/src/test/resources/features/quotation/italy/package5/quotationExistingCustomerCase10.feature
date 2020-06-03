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
##TODO regarder ici au niveau de option, cest Metallic paint and Panoramic roof quon doit choisi en meme temps
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects an option from popUp Menu
    And he selects an option '<option>'
    And he selects the accessories '<accessories>'
    And he go to the next page
    Then he search the customer by name '<customer Name>'
    And he go to the next page
    Then he accepts the prospect agreement 'Geo-Localization', 'Marketing purposes','Surveys'
    And he go to the next page
    ##TODO il y a des services a ajouter ici: PickUp and Delivery
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he gives a down payment of '<downPayment>'
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    Then he calculates the quote
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model  | car type                          | color                    | upholstery                                     |option                             | accessories          |customer Name | duration|distance|paymentIndex | paymentMethod                                          |downPayment|optionPrice |accessoriesPrice|
      | Lexus           | NX     |   Hybrid Luxury 4WD (2020)        | White pearl              | Dark Rose Luxury Leather with Shimamoku insert |Metallic paint and Panoramic roof  | LoJack Classic       |BOMI          |     48  | 60000  |1            |TFM2_Delivery cost direct/broker from dealer to customer|7000       |€ 700.00    |€ 272.06        |