# new feature
# Tags: optional
@italy
@pck8case1
Feature: Quote validation

  Scenario Outline: The dealer validates a quote in MilesRia
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a long term contract '20L00207'
    When he creates a new document
    Then he sends  the TFMIT document 'TFM_Delivery Document' per email
    When he creates a new document
#    Then he sends  the TFMIT document 'TFM_EOC_Anticipation Letter' per email
#    When he creates a new document
#    misssing jasper report TFM_EOC_Anticipation Letter
    Then he sends  the TFM document 'TFM_Withdrawal authorization' per email
    When he creates a new document
    Then he sends  the TFMIT document 'TFMIT_Vehicle delivery Confirmation' per email
    When he creates a new document
    Then he sends  the document 'TFM_Treasury Reporting' per email 'armel.bouendeu@toyota-fs.com'
#    And selects document

    Examples:
      |quoteID   |
      |002563/001|