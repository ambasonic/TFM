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
    Then he sets the customer as 'Private'
    And he selects a vehicle '<manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he selects an option '<option>'
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects the accessories '<accessories>'
    And he selects the accessories '<accessories2>'
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
    And he gives a down payment of '<downPayment>'
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he set the insurance type '<insurance>'
    And he adds at index 1 '<tyreNumber>' tires
    Then he calculates the quote
    And he check the total price '<totalPrice>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he checks the selected option price '<accessories2>' '<accessories2Price>'
    And he saved it
    And he log out


    Examples:
      |  manufacturer  | model  | car type             | color       | upholstery   |option                  |  accessories    | accessories2 |  street_name   | street_number | city_name | zip_code | phone_number | title   |surname  | name         |     email     | duration |distance |tyreIndex | tyreName              | tyreNumber | paymentIndex |                   paymentMethod                        |downPayment| insurance                              |totalPrice|optionPrice  |accessoriesPrice |accessories2Price|
      | Lexus          | RX     |450h Executive (2020) | Cargo Green | Leather Ocher|Metallic or pearl paint | LoJack Premium  | Portabici Sx |  Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Miss  |Silviana | Berluscozini | ac@milano.it  | 48       |80000    |    0     | Summer tires standard |      4     |      1       |TFM2_Delivery cost direct/broker from dealer to customer|   4000     |Anti-Theft LoJack Abbonamento > 34 mesi|€ 1,111.66| € 1,250.00  | € 272.06	     |€ 162.20         |