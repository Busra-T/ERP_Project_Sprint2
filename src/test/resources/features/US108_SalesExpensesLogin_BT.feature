@smoke
Feature: Sales and Expenses managers login function
  Agile Story: As sales and expense manager, I want to Login with valid credentials and get my account name.


  @TC124
  Scenario Outline: Verify managers login with valid credentials and get their account names.
    When Users login with their "<email>" and "<password>"
    Then Users see the correct "<account holder name>"
    Examples:
      | email                      | password        | account holder name |
      | salesmanager25@info.com    | salesmanager    | SalesManager25      |
      | expensesmanager10@info.com | expensesmanager | ExpensesManager10   |




