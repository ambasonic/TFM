# new feature
# Tags: optional

Feature: Create new customer as sole trader MilesWeb

  Scenario Outline: quote duplication
    Given The dealer open the MilesWeb portal Dealer home page
    And he login
    Then he can see the dealer home page
    When he click on the menu on new customer
    And navigate to sole trader <position>
#    And he chooses the legal entity '<legal>'
    And he gives a sole trader name '<trader_name>' in the company info form
    And he gives the name of street '<street_name>' in the contact data form
    And he gives the trader street number '<street_Nr>' in the contact data form
    And he gives the trader zip code '<zip_code>' in the contact data form
    And he gives the town name '<city_name>' in the contact data form
#    And he selects the country '<country>' in the contact data form
    And he gives the telephone number '<phone_number>' in the contact data form
    And he clicks on the button save



    Examples:
      |position |legal|trader_name |  street_name | street_Nr | city_name | zip_code | country | phone_number |
      | 2 |Sole\' trader | Francesco |  Plaza del Rey |8 |Milano| 10042| ITALY | 5455599 |