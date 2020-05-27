# new feature
# Tags: optional
@france
@pck6case1
Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'FRANCE'
    And he login in MilesRia
    And he search a long term contract '20I00197'
    Then he creates a new document
    And selects document

    Examples:
      |quoteID   |
      |002563/001|