# new feature
# Tags: optional

Feature: Create new Customer Miles Web

  Scenario Outline: quote duplication
    Given The dealer open the MilesWeb portal Dealer home page
    And he login
    Then he can see the dealer home page
    When he selects the new customer

    Examples:
      ||
      ||