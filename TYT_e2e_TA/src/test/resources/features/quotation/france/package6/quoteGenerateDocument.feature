# new feature
# Tags: optional
@france
@pck6case1
Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'FRANCE'
    And he login in MilesRia
    And he search a long term contract '20I00197'
    #
    When he creates a new document
    And he selects the document 'Avoirs à recevoir non lettrés'
    And he goes to the next step
    And he goes to the next step
    And he sets the email Address To with: 'armel.bouendeu@toyota-fs.com'
    Then he sends the email
    #
    When he creates a new document
    And he selects the document 'Recapitulatif pour commande'
    And he goes to the next step
    And he goes to the next step
    Then he sends the email
    #
    When he creates a new document
    And he selects the document 'Suivi dépôt de garantie'
    And he goes to the next step
    And he goes to the next step
    And he sets the email Address To with: 'armel.bouendeu@toyota-fs.com'
    Then he sends the email
    #
    When he creates a new document
    And he selects the document 'TFM_Contract'
    And he goes to the next step
    Then he sends the email
    #
    When he creates a new document
    And he selects the document 'TFM_FondDossier'
    And he goes to the next step
    Then he sends the email
    #
    When he creates a new document
    And he selects the document 'TFM_WelcomeLetter'
    And he goes to the next step
    And he clears the email input field And sets the email Address To with :'armel.bouendeu@toyota-fs.com'
    Then he sends the email

    Examples:
      |quoteID   |
      |002563/001|