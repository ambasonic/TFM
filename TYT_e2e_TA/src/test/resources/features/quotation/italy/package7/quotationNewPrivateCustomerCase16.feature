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
    Then he sets the customer as 'Private'
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects the accessories '<accessories>'
    And he go to the next page
    Then he can create a new customer
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
    And he check the total price '<totalPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model        | car type                                   | color       | upholstery      | accessories    | street_name   | street_number | city_name | zip_code | phone_number | title   |surname  | name         |     email     |duration |distance | paymentIndex |                   paymentMethod                        |insurance                              |totalPrice|accessoriesPrice|Fuel card Eni|Fuel card Eni choice|number of vehicle|
      | Toyota          | PROACE VERSO | 2.0D 150Cv S&S M/T L2 D Lounge 9 p. (2020) | White gloss | Dark grey cloth | LoJack Classic | Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Miss  |Silviana | Berluscozini | ac@milano.it  |36       |75000    |    1         |TFM2_Delivery cost direct/broker from dealer to customer|Anti-Theft LoJack Abbonamento > 34 mesi|€ 578.82  |€ 189.10        |Fuel card Eni|yes                 |2                |
