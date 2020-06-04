# new feature
# Tags: optional

@france
@pck3
Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'FRANCE'
    And he login in MilesRia
    And he search a quote '<quoteID>'
    When he selects the credit score
    And he set the status to 'Complété' and the decision to 'Accepted'
    Then he generate the contract
    When he selects the resulting contract
    When he selects stipulation
    And he activates the selected stipulation
    Then he can see the generated long term contract
    And he click on the vehicle order link
    And he update the delivery date
    Then he saved
    And he validate
    And he approve
    When he create an invoice from the vehicle order
    And he set the invoice number
    And he validate
    And he approve
    When he open the long term contract
    And he open the vehicle
    Then he select the vehicle usage
    And he registered the vehicle plates
    Then he saved
    When he open the long term contract
    Then he opens the workflow and he selects the contract Activation
    And he reevaluates the contract and close the tab
    And he calculate
    And he select the 'Express delivery' as delivery
    And he set the distance
    Then he deliver
    And he checks the status 'Running'

    Examples:
      |quoteID   |
      |002707/001|