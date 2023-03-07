
Feature: EPR repair order feature

  User story:As a POS & sales manager, I want to get repair order on the Repairs page.


  Scenario: Verify posmanager can select all the repair orders by clicking the top checkbox
    When user is on the login page
    Given user enters valid enter valid "pos_email" and "pos_password"
    Then  user click on the login button
    And  user should see Odoo
    Then user click on repair button
    And  user should be able to select all the repair orders
    Then user should see "POSManager13" login name on the page


  Scenario: Verify sales_manager can select all the repair orders by clicking the top checkbox
    When user as sales_manager is on the login page
    Given user as sales_manager is enters valid enter valid "sale_email" and "sale_password"
    Then  user as sales_manager click on the login button
    And  user as sales_manager should see Odoo
    Then user as sales_manager click on repair button
    And  user as sales_manager should be able to select all the repair orders
    Then user as sales_manager should see "SalesManager13" login name on the page