Feature: Confirming Password Functionality

  Scenario: Entering different value in to the "confirm password" field

    Given Navigate to OrangeHRM Website
    When I login as an admin
    And I navigate to admin management page
    When I click on add button
    And I enter a value into the Password field which is less than 8 characters
    Then I verify that notification messages “Should have at least 8 characters” in red color displayed.