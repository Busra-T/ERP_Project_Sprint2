Feature: Fina System login functionality

  Scenario: As POS and eventCRM manager Login and see their correct header name.
    Given user is on the login page of the Fina System application
    When user enters username
    And user enters password
    Then user should see "ExpensesManager57" header name on the page