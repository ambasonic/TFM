# new feature
# Tags: optional

@italy
@pck7case14

Feature: Quotation Template with a new private Customer Italy including Downpayment

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'ITALY'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    ## TODO from here select the type ---> 'Private' instead of 'Company' as has been doing so far
    And he selects a vehicle '<manufacturer>'
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
    Then he accepts the prospect agreement
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he gives a down payment of '<downPayment>'
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he set the insurance type '<insurance>'
    And he adds at index 0 '<tyreNumber>' tires
    Then he calculates the quote
    And he saved it
    ##TODO Milesria:Financial rental(191,35euro), RV(3.730,82 euro), Discounts(3.439,18euro), delivery cost(1.889,17euro)
    And he log out


    Examples:
      |  manufacturer  | model  | car type             | color       | upholstery   |option                  |  accessories    | accessories2 |  street_name   | street_number | city_name | zip_code | phone_number | title   |surname  | name         |     email     | birthDate  |duration |distance |tyreIndex | tyreName              | tyreNumber | paymentIndex |                   paymentMethod                        |downPayment| insurance                             |
      | Lexus          | RX     |450h Executive (2020) | Cargo Green | Leather Ocher|Metallic or pearl paint | LoJack Premium  | Portabici Sx |  Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Miss  |Silviana | Berluscozini | ac@milano.it  | 10/01/1947 |48       |80000    |    0    | Summer tires standard |      4     |      1       |TFM2_Delivery cost direct/broker from dealer to customer|   4000     |Anti-Theft LoJack Abbonamento > 34 mesi|