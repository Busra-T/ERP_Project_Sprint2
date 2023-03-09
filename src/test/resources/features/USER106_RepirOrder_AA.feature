
Feature: EPR repair order feature

  User story:As a POS & sales manager, I want to get repair order on the Repairs page.


  @us106
  Scenario: Verify posmanager can select all the repair orders by clicking the top checkbox
    When user is logged in
    Given user should see Odoo
    Then user click on repair button
    And  user should  click on the top ckeckbox
    Then user should select all the repair orders by clicking the top check box

  @us107
  Scenario: Verify selesmanager can select all the repair orders by clicking the top checkbox
    When user as seles manager is logged in
    Given user as seles manager should see Odoo
    Then user as seles manager click on repair button
    And  user as seles manager should  click on the top ckeckbox
    Then user as  seles manager  select all the repair orders by clicking the top check box
