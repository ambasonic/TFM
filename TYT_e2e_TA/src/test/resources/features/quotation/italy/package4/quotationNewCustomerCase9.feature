# new feature
# Tags: optional
@italy
@pck4case9
Feature: Quotation Template with a New Customer Italy including Relief Vehicle and Fuel card

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
    Then he can create a new customer
    And he selects the legal entity '<legal entity>'
    And he gives a company name in the company form
    And he gives the street name '<street_name>' in the contact data form
    And he gives the street number '<street_number>' in the contact data form
    And he gives the zip code '<zip_code>' in the contact data form
    And he gives the city name '<city_name>' in the contact data form
    And he gives the phone number '<phone_number>' in the contact data form
    And he go to contact person and selects the title '<title>'
    And he gives the surname '<surname>'
    And he gives the first name '<name>'
    And he gives the email '<email>'
    And he gives the date of birth '<birthDate>'
    And he go to the next page
    Then he accepts the prospect agreement
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
      | car manufacturer| model | car type                          | color                    | upholstery       |option         | accessories    | accessories2| legal entity    |  street_name   | street_number | city_name | zip_code | phone_number | title |surname| name         |     email     | birthDate   |paymentIndex | paymentMethod                                          |relief_vehicle |Fuel Card EdenRed |optionPrice |accessoriesPrice|accessories2Price|
      | Toyota          | Yaris |   1.5 Hybrid Active MY19 (2019)   | Black Metallic           | Cloth black/grey |Metallic paint | LoJack Premium | Portabici Sx|Societa  Semplice|  Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Dr  |Silvio | Berluscozini | ac@milano.it  | 10/01/1947  |1            |TFM2_Delivery cost direct/broker from dealer to customer|    yes        |yes               |€ 700.00    |€ 272.06        |€ 161.22         |