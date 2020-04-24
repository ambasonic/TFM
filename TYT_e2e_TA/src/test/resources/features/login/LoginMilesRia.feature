# new feature
# Tags: optional

Feature: Login Dealer

  Scenario Outline: Login dealer in milesria Italy
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    Examples:
      |homePage| userName  | password |
      |https://10.7.25.20:9943/TFMIT_TST/user/login.xhtml| testau1 | Amba1@2020  |