Feature:Employee name field

  Scenario:Verifying admin name in Employee Field

    Given Navigate to OrangeHRM Website
    When  Navigate to admin management page
    And   I click on add button
    And   I enter an invalid name in to the Employee name field
    Then  I verify that notification messages “no records found” and “invalid” in red color displayed.
