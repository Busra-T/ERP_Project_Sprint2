Feature: sales manager's module
  Agile story:
  As a sales manager, I should be able to access to the different modules.

  # AC: Verify the sales managers access to 19 modules.

  @US104
  Scenario: verify sales manager's module
    Given user logged as a sales manager
    Then user access the 19 module of the page with the "SalesManager52"
