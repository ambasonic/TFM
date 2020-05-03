# new feature
# Tags: optional

Feature: Create new Customer as Organization Miles Web

  Scenario Outline: create Organization
    Given The dealer open the MilesWeb portal Dealer home page
    And he login
    Then he can see the dealer home page
    When he click on the menu on new customer
    And navigate to organization <position>
#    Then he should see the page organisation registration page
#    When he select the legal entity '<legal_entity>'
    And he gives a company name '<company_name>' in the company form
    And he gives the street name '<street_name>' in the contact data form
    And he gives the street number '<street_number>' in the contact data form
    And he gives the city name '<city_name>' in the contact data form
    And he gives the zip code '<zip_code>' in the contact data form
    And he select the country '<country>' in the contact data form
    And he gives the phone number '<phone_number>' in the contact data form


    Examples:
       |position |legal_entity| company_name |  street_name | street_number | city_name | zip_code | country | phone_number |
      | 1 |Societa' Semplice| Ugobuyit |  Plaza del sol |3 | Nichelino| 10042| ITALY | 5455566 |