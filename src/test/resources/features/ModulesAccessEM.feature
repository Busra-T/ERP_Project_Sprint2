Feature: Modules feature
  Agile story: As an Event manager, I want to access to the different modules
  AC: Verify the Event managers access to 15 modules.

  Scenario: Verify access to 15 modules
    When user is on the base page
    Then user login as a Event manager
    Then use should see 15 modules





