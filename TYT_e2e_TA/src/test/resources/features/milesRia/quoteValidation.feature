# new feature
# Tags: optional

Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a quote '<quoteID>'
    When he selects the credit score
    Then he set the status to 'Completed' and the decision to 'Accepted'

    Examples:
      |quoteID| userName  | password |
      |001825/001| testau1 | Amba1@2020  |