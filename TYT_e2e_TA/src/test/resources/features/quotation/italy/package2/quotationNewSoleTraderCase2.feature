# new feature
# Tags: optional
@italy
@pck2case2
Feature: Quotation Template with an existing Customer Italy

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
    Then he can create a new customer
    And navigate to organization <position>
    And he selects the legal entity '<legal entity>'
    And he sets a company name
    And he gives the street name '<street_name>'
    And he gives the street number '<street_number>'
    And he gives the zip code '<zip_code>'
    And he gives the city name '<city_name>'
    And he gives the phone number '<phone_number>'
    And he select the contact person title '<title>'
    And he sets the surname '<surname>'
    And he sets the first name '<name>'
    And he sets the email '<email>'
    And he go to the next page
    Then he accepts the prospect agreement 'Geo-Localization', 'Marketing purposes','Surveys'
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he gives a down payment of '<downPayment>'
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he sets relief vehicle to '<relief_vehicle>'
    And he set the insurance type '<insurance>'
    Then he calculates the quote
    And he sets the number of vehicle to 2
    Then he calculates the quote
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he checks the selected option price '<optionPack>' '<optionPackPrice>'
    And he saved it
    And he log out

    Examples:
      |manufacturer|  model  |            car type             |  position |               color         |            upholstery         |  accessories  |                        optionPack                |   legal entity    |  street_name   | street_number | city_name | zip_code | phone_number | title |surname| name         |     email     | duration|distance| paymentIndex |                   paymentMethod                        |downPayment|              insurance           |leasePrice|servicePrice|totalPrice|accessoriesPrice|optionPackPrice|relief_vehicle|
      |Toyota      |  C-HR   |1.8H (122CV) E-CVT Dynamic (2019)|     1     |Dark grey Met with black roof| Leather interior and Alcantara| Lojack classic| Touch2 with Go Limited Edition Campaign (no MY20)|IMPRESA INDIVIDUALE|  Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Dr  |Silvio | Berluscozini | ac@milano.it  |     48  | 100000 |      1       |TFM2_Delivery cost direct/broker from dealer to customer|   5000    |Anti-Theft Lojack Abbonamento >34 |€ 286.20  |€ 196.83    |€ 483.03  | € 189.10       |€ 732.00   |      yes     |