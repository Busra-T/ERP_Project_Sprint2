package com.erp.step_definitions;

import com.erp.pages.DashBoardPage_AA;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RepairOrder_StepDefinition_AA {

    DashBoardPage_AA dashBoardPage_aa=new DashBoardPage_AA();
    @When("User is logged in page")
    public void user_is_logged_in_page() {
       dashBoardPage_aa.login("posmanager13@info.com","posmanager");

    }
    @Given("user should see Odoo")
    public void user_should_see_odoo() {
        String expectedTitle="Odoo";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Then("user click on repair button")
    public void user_click_on_repair_button() {
        dashBoardPage_aa.repairsButton.click();

    }
    @Then("user should  click on the top ckeckbox")
    public void user_should_click_on_the_top_ckeckbox() {
        dashBoardPage_aa.checkBox.click();

    }
    @Then("user should select all the repair orders by clicking the top check box")
    public void user_should_select_all_the_repair_orders_by_clicking_the_top_check_box() {
        Assert.assertTrue(dashBoardPage_aa.posManager.isDisplayed());

    }
    @When("user as seles manager is logged in")
    public void user_as_seles_manager_is_logged_in() {
        dashBoardPage_aa.login("salesmanager13@info.com","salesmanager");

    }
    @Given("user as seles manager should see Odoo")
    public void user_as_seles_manager_should_see_odoo() {
        String expectedTitle="Odoo";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Then("user as seles manager click on repair button")
    public void user_as_seles_manager_click_on_repair_button() {
        dashBoardPage_aa.repairsButton.click();

    }
    @Then("user as seles manager should  click on the top ckeckbox")
    public void user_as_seles_manager_should_click_on_the_top_ckeckbox() {
        dashBoardPage_aa.checkBox.click();

    }
    @Then("user as  seles manager  select all the repair orders by clicking the top check box")
    public void user_as_seles_manager_select_all_the_repair_orders_by_clicking_the_top_check_box() {
        Assert.assertTrue(dashBoardPage_aa.selesManager.isDisplayed());

    }


    }


