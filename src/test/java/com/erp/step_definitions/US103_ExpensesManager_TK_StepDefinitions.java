package com.erp.step_definitions;

import com.erp.pages.US103_ExpensesDefinitionFunction_TK_Page;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class US103_ExpensesManager_TK_StepDefinitions {

    US103_ExpensesDefinitionFunction_TK_Page accessPage = new US103_ExpensesDefinitionFunction_TK_Page();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.finasystems.net/");
    }

    US103_ExpensesDefinitionFunction_TK_Page loginpage = new US103_ExpensesDefinitionFunction_TK_Page();
    @When("user enters correct username")
    public void user_enters_correct_username() {
        US103_ExpensesDefinitionFunction_TK_Page.inputUsername.sendKeys("expensesmanager20@info.com");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
        US103_ExpensesDefinitionFunction_TK_Page.inputPassword.sendKeys("expensesmanager");
    }

    @When("users clicks to login button")
    public void users_clicks_to_login_button() {
        US103_ExpensesDefinitionFunction_TK_Page.loginButton.click();
    }


    @Then("user should verify access to {int} main modules")
    public void useShouldSeeModules(int modules) {


        Assert.assertEquals(modules, US103_ExpensesDefinitionFunction_TK_Page.ModulesAccessButtons.size());
        if (modules == 12) {
            System.out.println("You have 12 modules");
        }
    }


    @Then("user clicks all the modules")
    public void userClicksAllTheModules(){

        US103_ExpensesDefinitionFunction_TK_Page.calenderButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.notesButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.contactsButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.eventsButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.employeesButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.leavesButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.expensesButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.lunchButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.okButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.maintenanceButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.dashboardsButton.click();
        US103_ExpensesDefinitionFunction_TK_Page.websiteButton.click();





    }
}
