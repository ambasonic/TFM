# new feature
# Tags: optional

Feature: Create new Customer as Organization Miles Web

  Scenario Outline: create Organization
    Given The dealer open the MilesWeb portal Dealer home page
    And he login
    Then he can see the dealer home page
    When he click on the menu on new customer
    And navigate to organization <position>
#    And he choose the legal entity '<legal>'
    And he gives a company name '<company_name>' in the company form
    And he gives the street name '<street_name>' in the contact data form
    And he gives the street number '<street_number>' in the contact data form
    And he gives the zip code '<zip_code>' in the contact data form
    And he gives the city name '<city_name>' in the contact data form
    And he gives the phone number '<phone_number>' in the contact data form
#    And he select the country '<country>' in the contact data form
    And he click on the button save

    Examples:
      |position |legal|company_name |  street_name | street_number | city_name | zip_code | country | phone_number |
      | 1 |Societa\' Semplice | Toyota |  Plaza del sol |3 | Nichelino1| 10042| ITALY | 5455566 |