Feature: shopping items

  Scenario: adding items to cart
    Given user is on shopping main page
    When user cilcik Add To Cart button of first item
    And add second item
    Then item number in the cart will be 2
