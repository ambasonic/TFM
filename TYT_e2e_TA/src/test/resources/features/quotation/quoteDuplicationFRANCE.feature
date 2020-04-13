# new feature
# Tags: optional

Feature: Duplicate a quote and change of duration and distance with additional options

  Scenario Outline: quote duplication
    Given The dealer open the MilesWeb portal Dealer home page '<homePage>'
    When he login with the username as '<userName>' and the pwd '<password>'
    Then he can see the dealer home page
    When he select the pending quotes menu
    Then he can duplicate a quote

    Examples:
      |homePage| userName  | password |
      | http://10.7.25.10:8080/TFMFR_TST/user/login.xhtml| testau1   | Amba1@2020  |