# new feature
# Tags: optional
@pck2case1
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
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects the option pack '<optionPack>'
    And he selects an option '<option>'
    And he selects the accessories '<accessories>'
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
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he gives a down payment of '<downPayment>'
    And he selects the first <paymentIndex> payment '<paymentMethod>'
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds <tyreNumber> tires
    And he set the insurance type '<insurance>'
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he check the service price '<servicePrice>'
    And he check the total price '<totalPrice>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he checks the selected option price '<optionPack>' '<optionPackPrice>'
#    And he check the accessories price '<accessoriesPrice>'
#    And he check the option price '<optionPrice>'
#    And he check the option pack price '<optionPackPrice>'
    And he saved it
    And he log out

    Examples:
      |manufacturer|model|  car type         |  color  |  upholstery  |  accessories  |        option         |  optionPack         |  legal entity   |  street_name   | street_number | city_name | zip_code | phone_number | title |surname| name         |     email     | birthDate  |duration|distance|tyreIndex | tyreName              | tyreNumber | paymentIndex |                   paymentMethod                        |downPayment|              insurance           |leasePrice|servicePrice|totalPrice|accessoriesPrice|optionPrice|optionPackPrice|
      |Lexus       | Rx  |450h F Sport (2020)| F White | Leather Black| Lojack premium|Metallic or pearl paint| Premium Pack Fsport |Societa  Semplice|  Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Dr  |Silvio | Berluscozini | ac@milano.it  | 10/01/1947 |    24  | 40000  |     0    | Summer tires Standard |      4     |      1       |TFM2_Delivery cost direct/broker from dealer to customer|   7000    |Anti-Theft Lojack Abbonamento <=34| € 1,153.74|€ 320.64   |€ 1,474.38| € 272.06       |€ 1,250.00 |€ 2,850.01     |