Feature: A user should add Pizza to cart in Swiggy

Scenario: Add pizza to cart

    Given User enters swiggy url "https://www.swiggy.com/"
    When Enter location as "Bangalore"
    And select first location from suggested location in suggestion-box
    And click on search icon
    And Enter item as "pizza"
    And click on first suggested pizza
    And Add first item to cart
    Then click on viewCart
    
      
 