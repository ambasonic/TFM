# =new feature
# Tags: optional
@italy
@pck8case1
Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a long term contract '20L00664'
    #1
    When he creates a new document
    And he selects the document 'Rental contract expiration notice - Avviso di scadenza contratto di noleggio'
    And he goes to the next step
    And he goes to the next step
    And he clears the email input field And sets the email Address To with :'armel.bouendeu@toyota-fs.com'
    Then he sends the email
    #2
    When he creates a new document
    And he selects the document 'TFM_Delivery Document'
    And he goes to the next step
    And he goes to the next step
    And he clears the email input field And sets the email Address To with :'armel.bouendeu@toyota-fs.com'
    Then he sends the email
    #3
    When he creates a new document
    And he selects the document 'TFM_Treasury Reporting'
    And he goes to the next step
    And he goes to the next step
    And he sets the email Address To with: 'armel.bouendeu@toyota-fs.com'
    Then he sends the email
    #
#    When he creates a new document
#    And he selects the document 'TFM_Withdrawal authorization'
#    And he goes to the next step
#    And he clears the email input field And sets the email Address To with :'armel.bouendeu@toyota-fs.com'
#    Then he sends the email
    #4
    When he creates a new document
    And he selects the document 'TFMIT_Vehicle delivery Confirmation'
    And he goes to the next step
    And he goes to the next step
    And he clears the email input field And sets the email Address To with :'armel.bouendeu@toyota-fs.com'
    Then he sends the email
#    TFMIT-WelcomeLetter
    When he creates a new document
    And he selects the document 'TFMIT-WelcomeLetter'
    And he goes to the next step
    And he goes to the next step
    And he clears the email input field And sets the email Address To with :'armel.bouendeu@toyota-fs.com'
    Then he sends the email

    Examples:
      |quoteID   |
      |002563/001|