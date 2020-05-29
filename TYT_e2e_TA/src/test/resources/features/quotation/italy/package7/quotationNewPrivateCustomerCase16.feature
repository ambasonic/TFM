# new feature
# Tags: optional
@italy
@pck7case16
Feature: Quotation Template with a new Private customer Italy including vehicles with combinaison of services(fuel card)

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'ITALY'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    ## TODO from here select the type ---> 'Private' instead of 'Company' as has been doing so far
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects the accessories '<accessories>'
    And he go to the next page
    Then he can create a new customer
    ##TODO ici c est different, il faut regarder
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
    Then he accepts the prospect agreement 'Geo-Localization', 'Marketing purposes','Surveys'
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he accepts the Fuel card Eni '<Fuel card Eni>'
    And he set the insurance type '<insurance>'
    Then he calculates the quote
    ##TODO ici il faut implementer le nombre de vehicule a 2
    ##TODO set the number of vehicles at 'monthly = 2'
    And he saved it
    ##TODO Milesria: Discounts(1.295,70euro), delivery cost(1.889,17euro)
    And he log out

    Examples:
      | car manufacturer| model        | car type                                   | color       | upholstery      | accessories    | street_name   | street_number | city_name | zip_code | phone_number | title   |surname  | name         |     email     | birthDate  |duration |distance | paymentIndex |                   paymentMethod                        |insurance                              |Fuel card Eni|
      | Toyota          | PROACE VERSO | 2.0D 150Cv S&S M/T L2 D Lounge 9 p. (2020) | White gloss | Dark grey cloth | LoJack Classic | Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Miss  |Silviana | Berluscozini | ac@milano.it  | 10/01/1947 |36       |75000    |    1         |TFM2_Delivery cost direct/broker from dealer to customer|Anti-Theft LoJack Abbonamento > 34 mesi|yes          |