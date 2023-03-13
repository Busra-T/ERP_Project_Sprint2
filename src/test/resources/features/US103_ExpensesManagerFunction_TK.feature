Feature: Access verification to the main modules
  User Story:  As an Expenses manager, I should be able to access to the different modules.

  @wip
  Scenario: Verify the Expenses managers access 12 modules.
    Given user is on the login page
    When user enters correct username
    And user enters correct password
    And users clicks to login button
    Then user clicks all the modules