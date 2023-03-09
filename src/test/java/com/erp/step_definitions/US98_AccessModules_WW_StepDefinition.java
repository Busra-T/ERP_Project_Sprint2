package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.US98_AccessModules_WW_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US98_AccessModules_WW_StepDefinition {

    US98_AccessModules_WW_Page accessModulesWwPage = new US98_AccessModules_WW_Page ();

    @Given("users already logged in")
    public void users_already_logged_in() {
        accessModulesWwPage.login ("posmanager22@info.com","posmanager");

        Assert.assertTrue (accessModulesWwPage.posmanager.isDisplayed ());

    }


    @Then("user should verify {int} main modules")
    public void userShouldVerifyMainModules(int expected) {

        Assert.assertEquals (expected, accessModulesWwPage.modules.size ());


    }
}
