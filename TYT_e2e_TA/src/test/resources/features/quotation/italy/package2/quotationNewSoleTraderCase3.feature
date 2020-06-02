# new feature
# Tags: opti
@italy
@pck2case3
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
    And he selects an option '<option>'
    And he selects the option pack '<option pack>'
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
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he accepts the Fuel card Eni '<Fuel card Eni>'
    And he set the insurance type '<insurance>'
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he check the service price '<servicePrice>'
    And he check the total price '<totalPrice>'
    And he check the accessories price '<accessoriesPrice>'
    And he check the option price '<optionPrice>'
    And he check the option pack price '<optionPackPrice>'
    And he saved it
    And he log out

    Examples:
      |manufacturer|  model  |               car type               |  position |   color         | upholstery       |  accessories  |         option        |            option pack          |   legal entity    |  street_name   | street_number | city_name | zip_code | phone_number | title |surname| name         |     email     | duration|distance| paymentIndex |                   paymentMethod                        |              insurance           |leasePrice|servicePrice|totalPrice|accessoriesPrice|optionPrice|optionPackPrice|Fuel card Eni|
      |Toyota      | Corolla |   TS 1.8 Hybrid Active (2020)        |     1     |Super White gloss| Black Cloth      | Lojack classic|Super white gloss paint| Sensori di parcheggio anteriori |IMPRESA INDIVIDUALE|  Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Dr  |Silvio | Berluscozini | ac@milano.it  |     48  | 100000 |      1       |TFM2_Delivery cost direct/broker from dealer to customer|Anti-Theft Lojack Abbonamento >34 | € 367.18 | € 169.75   |€ 536.93  | € 400.00       |€ 450.00   |€ 189.10       |      yes    |