Feature: verify Cupon pdf feature

  @Sanity
  Scenario: As a user , customer should be able to see cuopon pdf file
    Given user navigate the url of fedex
    When click on print and design menu , select get cupon and deals
    And click on get cupon button
    Then customer will see the coupon file
