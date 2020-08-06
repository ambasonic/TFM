# new feature
# Tags: optional
@italy
@pck2case1
Feature: Create a quotation with an new customer - comapany including insurance and tires

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
    And he set the insurance type '<insurance>'
    And he adds at index 1 '<tyreNumber>' tires
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he checks the selected option price '<optionPack>' '<optionPackPrice>'
    And he saved it
    And he log out

    Examples:
      |manufacturer|model|  car type         |  color  |  upholstery  |  accessories  |        option         |  optionPack         |  legal entity   |  street_name   | street_number | city_name | zip_code | phone_number | title |surname| name         |     email     | birthDate  |duration|distance|tyreIndex | tyreName              | tyreNumber | paymentIndex |                   paymentMethod                        |downPayment|              insurance                 |leasePrice |accessoriesPrice|optionPrice|optionPackPrice|
      |Lexus       | Rx  |450h F Sport (2020)| F White | Leather Black| Lojack premium|Metallic or pearl paint| Premium Pack Fsport |Societa  Semplice|  Plaza del sol |       3       | Nichelino | 10042    |    5455566   |   Dr  |Silvio | Berluscozini | ac@milano.it  | 10/01/1947 |    24  | 40000  |     0    | Summer tires Standard |      4     |      1       |TFM2_Delivery cost direct/broker from dealer to customer|   7000    |Anti-Theft LoJack Abbonamento <= 34 mesi| € 1,742.42| € 272.06       |€ 1,250.00 |€ 2,850.01     |