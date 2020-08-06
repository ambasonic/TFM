# new feature
# Tags: optional

@france
@pck2case1france
Feature: Quotation Template with a New Customer France

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
    And he selects an option '<option2>'
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
    And he scrolls down
    Then he calculates the quote
    And he check the total price '<totalPrice>'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '<optionPrice>'
 #   And he checks the selected option price '<option2>' '<optionPrice2>'
    And he clicks on the financial summary panel
    And he scrolls down for credit request
    And he scrolls down
    And he saved it
    And he log out
    Examples:
      | car manufacturer| model   | car type                             | color                  | upholstery          |option          | option2                             | legal_entity|Fleet_Size | street_name       | street_number |city_name       | zip_code | phone_number | title |surname| name     |     email             |product_type        | duration | distance |totalPrice|optionPrice|optionPrice2|
      | Toyota          | COROLLA | Hybride 122h Dynamic Business (2020) | Black metallic paint   | Sellerie tissu Noir |Metallic paint  | Front radar parking distance sensors| SARL        |   2       |Place du boulevard |       80      | VAUCRESSON     | 92420    |    5455566   |   Mr  |Bernard| Xavier   | Automation@france.fr  |KINTO ONE DECALAGE  |48        | 80000    |€ 400,51  |€ 650,00   |€ 280,00    |