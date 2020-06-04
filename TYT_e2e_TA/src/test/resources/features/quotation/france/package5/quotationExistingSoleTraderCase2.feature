# new feature
# Tags: optional

@france
@pck5case2
Feature: Quotation Template with an Existing Sole Trader France including Downpayment and relief vehicle

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
    And he updates the duration <duration>
    And he updates the distance <distance>
    ##TODO il faut implementer downpayment
#    And he gives a down payment of '<downPayment>'
    And he selects the tyre type <tyreIndex> '<tyreName>'
    And he adds at index 2 '<tyreNumber>' tires
    And he sets relief vehicle to '<relief_vehicle>'
    Then he calculates the quote
    And he check the lease price '€ 324,35'
    And he clicks on the financial summary panel
    And he clicks on the vehicle panel
    And he checks the selected option price '<option>' '€ 300,00'
    And he clicks on the financial summary panel
    And he saved it
    And he log out

    Examples:
      | car manufacturer| model         | car type                           | color                      | upholstery       |option               |customer Name  | product_type       | duration | distance  |downPayment|tyreIndex | tyreName        |tyreNumber |relief_vehicle|
      | Toyota          | YARIS HYBRIDE | 1.5 VVT-I HYBRID Collection (2019) | Two-tone Pearl White/Black |Cloth Black/White |Rear parking sensors |COCCINELLE     | KINTO ONE DECALAGE |48        | 80000     | 4000      |    2     | 4-Seasons Tires |     4     |yes           |