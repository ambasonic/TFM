# new feature
# Tags: optional

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
    Then he search a customer
    # give the customer name for the search ANNA PAGANO
    And he go to the next page
    Then he accept the condition
       # rename to prospect agreement

    Examples:
      |homePage| userName  | password | car manufacturer| model| car type | color | upholstery |description |
      |https://10.7.25.20:9943/TFMIT_TST/user/login.xhtml| testau1  | Amba1@2020  | Toyota | Aygo | 1.0 VVT-i x-play | Anthracite Grey metallic | Cloth upholstery Dark Grey with bi-toned bolsters white and light grey | lojack classic|