# new feature
# Tags: optional

Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a quote '<quoteID>'
    When he selects the credit score
    And he set the status to 'Completed' and the decision to 'Accepted'
    Then he generate the contract
    When he selects the resulting contract
    Then he can see the generated long term contract
    And he create a vehicle Order
    And he set the supplier name to 'A.Corvi'
    And he update the delivery date
    Then he saved
    And he validate
    And he approve
    When he create an invoice from the vehicle order
    And he set the invoice number
    And he validate the process
    When he open the long term contract


    Examples:
      |quoteID| userName  | password |
      |001877/001| testau1 | Amba1@2020  |