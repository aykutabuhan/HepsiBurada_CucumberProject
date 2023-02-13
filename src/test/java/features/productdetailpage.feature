Feature: ProductDetailPage Steps

  Scenario: Add to Product in Basket Page
    Given navigate to website "https://www.hepsiburada.com/iphone-11-128-gb-p-HBV0000122JCR"
    And click to comments
    And click to thumps up
    And click to add to cart
    When click to go to cart
    Then verify in cart page