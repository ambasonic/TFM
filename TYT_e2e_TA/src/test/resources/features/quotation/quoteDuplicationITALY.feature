# new feature
# Tags: optional

@italy
Feature: Duplicate a quote and change of duration and distance with additional options

  Scenario Outline: quote duplication
    Given The dealer open the MilesWeb portal Dealer home page '<homePage>'
    When he login with the username as '<userName>' and the pwd '<password>'
    Then he can see the dealer home page
    When he select the pending quotes menu
    Then he can duplicate a quote
    And he go to the next page
    And he updates the duration 60
    And he updates the distance 190000
    And he selects the first 1 payment 'TFM2_Delivery cost direct/broker from dealer to customer'
    And he saved it
    # Le Lojack Premium
    # Portabici Dx a change dans excel dois aussi le faire

    Examples:
      |homePage| userName  | password |
      | https://10.7.25.20:9943/TFMIT_TST/user/login.xhtml| testau1   | Amba1@2020  |