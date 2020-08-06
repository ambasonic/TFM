# new feature
# Tags: opti
@italy
@pck2case3
Feature: Create a quotation with an new sole trader including fuel card and additional vehicle number

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
    And he selects an option '<option>'
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
    Then he accepts the prospect agreement
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he adds the service '<Fuel card Eni>' '<Fuel card Eni choice>'
    And he set the insurance type '<insurance>'
    Then he calculates the quote
    And he sets the number of vehicle to <number of vehicle>
    And he check the lease price '<leasePrice>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he checks the selected option price '<optionPack>' '<optionPackPrice>'
    And he saved it
    And he log out

    Examples:
      |manufacturer|  model  |               car type               |  position |   color         | upholstery       |  accessories  |         option        |            optionPack          |   legal entity    |  street_name   | street_number | city_name | zip_code | phone_number | title |surname| name         |     email     | duration|distance| paymentIndex |                   paymentMethod                        |              insurance                 |leasePrice|accessoriesPrice |optionPrice|optionPackPrice|Fuel card Eni|Fuel card Eni choice|number of vehicle|
      |Toyota      | Corolla |   TS 1.8 Hybrid Active (2020)        |     1     |Super White gloss| Black Cloth      | LoJack Classic|Super White gloss paint| Sensori di parcheggio anteriori |IMPRESA INDIVIDUALE|  Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Dr  |Silvio | Berluscozini | ac@milano.it  |     48  | 100000 |      1       |TFM2_Delivery cost direct/broker from dealer to customer|Anti-Theft LoJack Abbonamento > 34 mesi |€ 487.78 | € 189.10       |€ 450.00   |€ 400.00       |Fuel card Eni|yes                 |2                |