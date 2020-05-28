# new feature
# Tags: optional

@france
@pck4case7
Feature: Quotation Template with a New Customer France including relief vehicle and Fuel card

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'FRANCE'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he selects an option '<option>'
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he go to the next page
    Then he can create a new customer
    And he selects the legal entity '<legal_entity>'
    And he gives a company name in the company form
    And he gives the street fleet size '<Fleet_Size>' in the contact data form
    And he gives the street name '<street_name>' in the contact data form
    And he gives the street number '<street_number>' in the contact data form
    And he gives the zip code '<zip_code>' in the contact data form
    And he gives the city name '<city_name>' in the contact data form
    And he gives the phone number '<phone_number>' in the contact data form
    And he go to contact person and selects the title '<title>'
    And he gives the surname '<surname>'
    And he gives the first name '<name>'
    And he gives the email '<email>'
    And he go to the next page
    Then he accepts the prospect agreement
    And he sets the product to '<product_type>'
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds at index 2 '<tyreNumber>' tires
    Then he calculates the quote
    And he saved it
    And he log out
# retirer tous les index tyreIndex, tyreNumberIndex
    Examples:
      | car manufacturer| model | car type                | color                   | upholstery                                                             |option            | legal_entity|Fleet_Size | street_name       | street_number |city_name       | zip_code | phone_number | title |surname| name     |     email             |product_type        | duration | distance |tyreIndex | tyreName        |tyreNumber |
      | Toyota          | AYGO  | 1.0 VVT-i x-play (2019) | Red Chilien gloss paint | Cloth upholstery Dark Grey with bi-toned bolsters white and light grey |Chilien Red paint | SARL        |   2       |Place du boulevard |       80      | VAUCRESSON     | 92420    |    5455566   |   Mr  |Bernard| Xavier   | Automation@france.fr  |KINTO ONE DECALAGE  |36        | 60000    |     2    | 4-Seasons Tires |      4    |