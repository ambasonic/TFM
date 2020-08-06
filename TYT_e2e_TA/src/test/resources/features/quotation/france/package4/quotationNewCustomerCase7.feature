# new feature
# Tags: optional

@france
@pck4case7
Feature: Create a quote with a new customer - company-  including relief vehicle and tires all seasons

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
    And he scrolls down
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he selects the quotation template '<quotation template>'
    And he adds the service '<tires>' '<tire choice>'
    And he adds at index 0 '<tyreNumber>' tires
    And he adds the service '<relief vehicle>' '<relief vehicle choice>'
    Then he calculates the quote
    And he check the lease price '<lease price>'
    And he scrolls down for credit request
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model | car type                | color                   | upholstery                                                             |legal_entity|Fleet_Size | street_name       | street_number |city_name       | zip_code | phone_number | title |surname| name     |     email             |product_type        | duration | distance |tires | tire choice        |tyreNumber |relief vehicle choice|relief vehicle|quotation template|lease price|
      | Toyota          | AYGO  | 1.0 VVT-i x-play (2019) | Pure white gloss paint  | Cloth upholstery Dark Grey with bi-toned bolsters white and light grey | SARL        |   2      |Place du boulevard |       80      | VAUCRESSON     | 92420    |    5455566   |   Mr  |Bernard| Xavier   | Automation@france.fr  |KINTO ONE DECALAGE  |36        | 60000    |tires | 4-Seasons Tires    |     8     |yes                  |relief vehicle|KINTO BUSINESS    |€ 263,69   |