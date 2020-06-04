# new feature
# Tags: optional

@france
@pck5case3
Feature: Quotation Template with a New Sole Trader France including combinations of services(fuel card)

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
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds at index 0 '<tyreNumber>' tires
    And he accepts the Fuel Card Edenred '<Fuel Card EdenRed>'
    Then he calculates the quote
    And he sets the number of vehicle to 3
    And he check the lease price '€ 738,41'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '€ 700,00'
    And he clicks on the financial summary panel
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model        | car type                               | color                     | upholstery   |option          |position | legal entity |  street_name       | street_number | city_name  | zip_code | phone_number | title |surname| name       |     email                |product_type          | duration | distance |tyreIndex | tyreName     |tyreNumber |Fuel Card EdenRed|
      | Toyota          | PROACE VERSO | 2.0 D LONG 180 D-4D AUTO LOUNGE (2020) | Steel Grey metallic paint |Leather Black |Metallic paint  |   1     |PROF.LIB      |  Place du Boulevard|       80      | Vaucresson | 92420    |    5787556   |   Mr  |Lumiere | Renard    | soleautomation@paris.fr  |KINTO ONE DECALAGE    |36        | 45000    |     0    | Summer Tires |      4    |yes              |