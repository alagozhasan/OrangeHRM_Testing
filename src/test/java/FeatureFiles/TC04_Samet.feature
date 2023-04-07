Feature: Mandatory Fields Functionality

  Scenario: Click Save Button Without Entering Any Mandatory Fields

    Given Navigate to OrangeHRM Website
    When I login as an admin
    And I navigate to admin management page
    When I click on add button
    And I click on save button
    Then Verify “Required“ notification message on AddUserPage
