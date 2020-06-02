# new feature
# Tags: optional
@france
@pck6case1
Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'FRANCE'
    And he login in MilesRia
    And he search a long term contract '20I00197'
    When he creates a new document
    Then he sends  the document 'Avoirs à recevoir non lettrés' per email 'armel.bouendeu@toyota-fs.com'
    When he creates a new document
    Then he sends  the document 'Recapitulatif pour commande' per email
    When he creates a new document
    Then he sends  the document 'Suivi dépôt de garantie' per email 'armel.bouendeu@toyota-fs.com'
    When he creates a new document
    Then he sends  the TFM document 'TFM_Contract' per email
    When he creates a new document
    Then he sends  the TFM document 'TFM_FondDossier' per email
    When he creates a new document
    Then he sends  the TFM document 'TFM_WelcomeLetter' per email
#    And selects document

    Examples:
      |quoteID   |
      |002563/001|