# new feature
# Tags: optional

@france
@pck5case3france
Feature: Quotation Template with a New Sole Trader France including combinations of services(fuel card)

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice '<country>'
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
    And navigate to organization <position>
    And he selects the legal entity '<legal entity>'
    And he sets a company name
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
    And he sets the product to '<product_type>'
    And he go to the next page
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he adds the service '<Fuel card TOTAL>' '<Fuel Card Total - Balance Pack>'
    Then he calculates the quote
    And he sets the number of vehicle to <number of vehicle>
    And he scrolls down
    Then he calculates the quote
    And he check the total price '<totalPrice>'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '<optionPrice>'
    And he clicks on the financial summary panel
    And he scrolls down
    And he saved it
    And he log out

    Examples:
    |country| car manufacturer| model        | car type                               | color                     | upholstery   |option          |position | legal entity |  street_name       | street_number | city_name  | zip_code | phone_number | title |surname| name       |     email                |product_type          | duration | distance |totalPrice|optionPrice|Fuel card TOTAL|Fuel Card Total - Balance Pack| number of vehicle|
    |france | Toyota          | PROACE VERSO | 2.0 D LONG 180 D-4D AUTO LOUNGE (2020) | Steel Grey metallic paint |Leather Black |Metallic paint  |   1     |PROF.LIB      |  Place du Boulevard|       80      | Vaucresson | 92420    |    5787556   |   Mr  |Lumiere | Renard    | soleautomation@paris.fr  |KINTO ONE DECALAGE    |36        | 75000    |€ 759,11  |€ 700,00   |Fuel card TOTAL|Fuel Card Total - Balance Pack| 3                |