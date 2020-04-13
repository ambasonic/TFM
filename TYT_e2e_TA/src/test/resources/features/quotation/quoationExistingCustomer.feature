# new feature
# Tags: optional

Feature: Quotation Template with an existing Customer

  Scenario Outline: quotation
    Given The dealer open the MilesWeb portal Dealer home page '<homePage>'
    When he login with the username as '<userName>' and the pwd '<password>'
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he selects an option '<description>'
    And he go to the next page
    Then he search a customer
    And he go to the next page

    Examples:
      |homePage| userName  | password | car manufacturer| model| car type | color | upholstery |description |
      | http://10.7.25.10:8080/TFMFR_TST/user/login.xhtml| testau1   | Amba1@2020  | toyota | Aygo | 1.0 VVT-i x-play |  Blanc Pur gloss paint | Cloth upholstery Dark Grey with bi-toned bolsters white and light grey | Metallic paint |