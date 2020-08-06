# new feature
# Tags: optional

@france
@pck5case2france
Feature: Create a quote with an existing Sole Trader including Downpayment and relief vehicle

  Scenario Outline: quotation
    Given The dealer open the MilesWeb backoffice 'FRANCE'
    And he login
    Then he can see the dealer home page
    When he selects a new quotation
    And he selects a vehicle '<car manufacturer>'
    And he selects a model '<model>'
    And he selects the type '<car type>'
    And he go to the next page
    Then he can selects vehicle options
    And he selects an option '<option>'
    And he chooses color '<color>' and upholstery '<upholstery>'
    And he go to the next page
    Then he search the sole trader by name '<customer Name>'
    And he go to the next page
    Then he accepts the prospect agreement
    And he sets the product to '<product_type>'
    And he go to the next page
    And he scrolls down
    And he gives a down payment of '<downPayment>'
    And he updates the duration <duration>
    And he updates the distance <distance>
    And he adds the service '<tires>' '<tire choice>'
    And he adds at index 0 '<tyreNumber>' tires
    And he adds the service '<relief vehicle>' '<relief vehicle choice>'
    Then he calculates the quote
    And he check the lease price '<lease price>'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '<optionPrice>'
    And he clicks on the financial summary panel
    And he scrolls down
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model         | car type                        | color                   | upholstery       |option         |customer Name  | product_type       |  distance  |duration |downPayment|tyreNumber |tires | tire choice        |relief vehicle choice|relief vehicle|lease price|optionPrice|
      | Toyota          | YARIS HYBRIDE | 1.5 VVT-I HYBRID Dynamic (2019) | Manhattan Grey metallic |Cloth Black/Grey  |Metallic paint |COCCINELLE     | KINTO ONE DECALAGE |  80000     |36       |1500       |     4     |tires | Summer Tires       |yes                  |relief vehicle|€ 277,13   |€ 550,00   |