# new feature
# Tags: optional

Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a quote '<quoteID>'
#    When he selects the credit score
#    And he set the status to 'Completed' and the decision to 'Accepted'
#    Then he generate the contract
    When he selects the resulting contract
    Then he can see the generated long term contract
    And he create a vehicle Order
    And he update the delivery date


    Examples:
      |quoteID| userName  | password |
      |001854/001| testau1 | Amba1@2020  |