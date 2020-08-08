# new feature
# Tags: optional
@italyMilesRia
@pck3
Feature: Contract Running

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a quote '<quoteID>'
    And he generates a quote
    And he saves the quoteID
    Then he closes the browser
    And The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search the saved quote
    When he selects the credit score
    And he sets the status to 'Completed' and the decision to 'Accepted'
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
    And he opens the vehicle
    Then he select the vehicle usage
    And he registered the vehicle plates
    Then he saved
    When he open the long term contract
    Then he opens the workflow and he selects the contract initiation
    And he reevaluates the contract and close the tab
    And he calculate
    And he select the 'Express delivery' as delivery
    And he set the distance
    Then he deliver
    And he checks the status 'Running'


    Examples:
      |quoteID   |
      | 019872/001|


