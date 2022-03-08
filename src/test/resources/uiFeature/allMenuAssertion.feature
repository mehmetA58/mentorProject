@all
Feature: ALL Menu
  Scenario: user verify the ALL menu
    Given user goes to Amazon Home Page
    Then user clicks ALL menu
    And user selects "Electronics"
    Then user verifies that there are 17 subcategories
    Then user verifies the title of all subcategories
    And close page