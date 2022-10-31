@wip
Feature: Getting all information about a product on ebebek website

  Scenario: As a user, I should see the products in outlet


    When I should be in the ebebek website
    And I should write "bebek bezi" and searching the products
    Then I should get all prices of products in the first page as List<>



