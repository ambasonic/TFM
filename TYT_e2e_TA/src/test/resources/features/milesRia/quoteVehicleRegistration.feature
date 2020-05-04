Feature: Quote validation

  Scenario Outline: Vehicle registration
    Given The dealer open the MilesRia backoffice 'ITALY'
    And he login in MilesRia
    And he search a quote '<quoteID>'
    When he selects the resulting contract
    And he open the vehicle
    Then he select the vehicle usage
    And he registered the vehicle plates
    And he set the chassis number '<VinNr>'
    Then he saved


    Examples:
      |quoteID| VinNr  | password |
      |001894/001| 1HGCP26449A021764 | Amba2@2020  |