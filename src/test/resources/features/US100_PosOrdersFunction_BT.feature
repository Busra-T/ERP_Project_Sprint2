@regression
Feature: POS order view function
  Agile Story: As a Point of Sale manager (POS), I should be able to view product order.

  Background: For all scenarios
    When user logged in as POS manager
    And user clicks on Point of Sale
    Then user clicks on orders
    Then user clicks Order Ref checkbox




   @TC118
   Scenario: Verify the POS managers can view the order list
    Then user sees all orders are checked


   @TC119  @wip
    Scenario: Verify Action dropdown 2 options: Export and Delete
         Then user sees the Action dropdown
         And user clicks on Action dropdown
         Then user sees the below options
           |Export|
           |Delete|


