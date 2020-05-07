Feature: Quote validation

  Scenario Outline: Vehicle registration
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a quote '<quoteID>'
    When he selects the resulting contract
    And he open the vehicle
    Then he select the vehicle usage
    And he registered the vehicle plates
    Then he saved
    When he open the long term contract
    And he calculate
    And he select the 'Express delivery' as delivery
    And he set the distance
    Then he deliver

    Examples:
      |quoteID| VinNr  | password |
      |001928/001| 1HGCP26449A021764 | Amba2@2020  |