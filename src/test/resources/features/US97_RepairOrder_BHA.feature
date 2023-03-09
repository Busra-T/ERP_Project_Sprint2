Feature: As a POS & sales manager, I want to access the Repairs page.
Background:
  Given users already logged in

  Scenario: Verify users access the Repairs page
    When user should see repaires module
   And user click the Repairs module
    And users should verify 6 column orders
    Then user should verify login as POS manager


