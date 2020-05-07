# new feature
# Tags: optional

Feature: Quotation Template with an existing Customer Italy

  Scenario Outline: quotation
    Given The dealer open the MilesWeb portal Dealer home page
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
#    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects an option '<option>'
    And he selects the option pack '<option pack>'
    And he selects the accessories '<accessories>'
    And he go to the next page
    Then he can create a new customer
    And he selects the legal entity '<legal entity>'
    And he gives a company name '<company name>' in the company form
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
#    And he updates the duration <duration>
#    And he updates the distance <distance>
#    And he selects the first <paymentIndex> payment '<paymentMethod>'
#    Then he calculates the quote
#    And he saved it
#    And he log out

    Examples:
      |manufacturer|model|  car type  |color|upholstery|  accessories  |        option         |  option pack |company name|  legal entity   |company_name|  street_name   | street_number | city_name | zip_code | country | phone_number | title |surname| name         |     email     | birthDate  |
      |Lexus       | Rx  |450h F Sport|     |          | Lojack premium|Metallic or pearl paint| Premium Pack | Ambasonic  |Societa  Semplice|   Toyota   |  Plaza del sol |        3      | Nichelino | 10042    | ITALY   |    5455566   |   Dr  |Silvio | Berluscozini | ac@milano.it  | 10/01/1947 |