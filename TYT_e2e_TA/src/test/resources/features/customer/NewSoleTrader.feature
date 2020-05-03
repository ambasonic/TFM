# new feature
# Tags: optional

Feature: Create new customer as sole trader MilesWeb

  Scenario Outline: quote duplication
    Given The dealer open the MilesWeb portal Dealer home page
    And he login
    Then he can see the dealer home page
    When he click on the menu on new customer
    And navigate to sole trader <position>




    Examples:
      |