# new feature
# Tags: optional
@italy
@pck5case11
Feature: Quotation Template with a New Customer Italy including TPL(Services)

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
    And he selects an option '<option>'
    And he selects an option '<option2>'
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
    And he adds the service '<service>' '<service_option>'
    And he adds the service '<service2>' '<service_option2>'
    Then he calculates the quote
    And he check the lease price '<leasePrice>'
    And he check the service price '<servicePrice>'
    And he checks the selected option price '<option>' '<optionPrice>'
    And he checks the selected option price '<option2>' '<option2Price>'
    And he checks the selected option price '<accessories>' '<accessoriesPrice>'
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model | car type                  | color       | upholstery                                     |option        | option2        | accessories    | legal entity    |  street_name   | street_number | city_name | zip_code | phone_number | title |surname| name         |     email     | birthDate   |duration |distance|paymentIndex | paymentMethod                                          |downPayment|service      |service_option|service2                           |service_option2|leasePrice|servicePrice|optionPrice |option2Price|accessoriesPrice|
      | Lexus           | NX    |  Hybrid Luxury 4WD (2020) | White pearl | Dark Rose Luxury Leather with Shimamoku insert |Panoramic roof| Metallic paint | LoJack Classic |Societa  Semplice|  Plaza del sol |       3       | Nichelino | 10045    |    5787556   |   Dr  |Silvio | Berluscozini | ac@milano.it  | 10/01/1947  |     48  | 60000  |1            |TFM2_Delivery cost direct/broker from dealer to customer|4500       |TPL exemption|Franchigia 500|Theft, fire, glasses exemption     |Franchigia 500 | € 542.99 |  € 196.98  |  € 600.00  |€ 1,150.00  |€ 189.10        |