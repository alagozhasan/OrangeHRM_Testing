Feature: taken username

  Scenario: Username is already exist
    Given Navigate to OrangeHRM
    When I login as an admin
    And I navigate to admin management page
    When I got the previously taken username
    And Click on add button
    Then I write already taken username
    And Already exist notification messages should be displayed in red
