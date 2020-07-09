# new feature
# Tags: optional

@france
@pck3france
Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'FRANCE'
    And he login in MilesRia
    And he search a quote '<quoteID>'
    And he generates a quote
    And he saves the quoteID
    Then he closes the browser
    And The dealer open the MilesRia backoffice 'FRANCE'
    And he login in MilesRia
    And he search the saved quote
    When he selects the credit score
    And he sets the status to 'Demandé'
    Then he saved
    And he selects the credit application
    And he clicks on complete
    And he sets the decision to 'Refused'
    And he clicks on complete
    When he selects stipulation from credit applications
    And he activates the selected stipulation
    Then he selects overview
    And he clicks on complete
    And he clicks on complete
    And he selects overview
    And he sets the decision to 'Accepted'
    Then he clicks on complete
    When he opens the quote tab
    Then he selects summary
    When he selects the resulting contract
    Then he selects stipulation
    And he activates the selected stipulation
    And he selects in LTC general
#    Then he can see the generated long term contract
#    And he click on the vehicle order link
    And he opens the vehicle
    And he opens the vehicle order
    And he update the delivery date
    Then he saved
    And he validate
    And he approve
    When he create an invoice from the vehicle order
    And he set the invoice number
    And he validate
    And he approve
    When he open the long term contract
    And he opens the vehicle
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
      |quoteID    |
      |003174/001 |