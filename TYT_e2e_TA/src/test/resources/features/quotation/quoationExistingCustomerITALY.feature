# new feature
# Tags: optional
@italy
Feature: Quotation Template with an existing Customer Italy

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
    Then he search the customer by name '<customer Name>'
    And he go to the next page
    Then he accepts the prospect agreement
    And he go to the next page
    And he updates the duration 48
    And he updates the distance 80000
    And he selects the first 1 payment 'TFM2_Delivery cost direct/broker from dealer to customer'
    Then he calculates the quote
    And he saved it


    Examples:
      |homePage| userName  | password | car manufacturer| model| car type | color | upholstery |description | customer Name |
      |https://10.7.25.20:9943/TFMIT_TST/user/login.xhtml| testau1  | Amba1@2020  | Toyota | Aygo | 1.0 VVT-i x-play | Anthracite Grey metallic | Cloth upholstery Dark Grey with bi-toned bolsters white and light grey | lojack classic| ANNA PAGANO |