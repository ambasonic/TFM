# new feature
# Tags: optional

Feature: Generate Contract

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a quote '<quoteID>'
    When he selects the credit score
    And he set the status to 'Completed' and the decision to 'Accepted'
    Then he generate the contract

    Examples:
      |quoteID| VinNr  |
      |001899/001| 1NXBR32E93Z070422 |