package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.EventManagerPageEM;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ModulesAccessEM_StepDefinitions extends BasePage {

    EventManagerPageEM eventManagerPageEM = new EventManagerPageEM();

    @When("user is on the base page")
    public void user_is_on_the_base_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Then("user login as a Event manager")
    public void user_login_as_a_event_manager() {
        eventManagerPageEM.login("eventscrmmanager14@info.com","eventscrmmanager");

        //email.sendKeys(ConfigurationReader.getProperty("login"));
        //password.sendKeys(ConfigurationReader.getProperty("password"));
        //btn_logIn.click();
        //email.sendKeys("eventscrmmanager1@info.com");
        //password.sendKeys("eventscrmmanager");
    }

    @Then("use should see {int} modules")
    public void useShouldSeeModules(int modules) {



        Assert.assertTrue(modules == eventManagerPageEM.ModulesAccessButtons.size());

        //System.out.println("eventManagerPageEM.ModulesAccessButtons.size() = " + eventManagerPageEM.ModulesAccessButtons.size());


    }


        //  |Discuss|
        //    |Calendar|
        //    |Notes|
        //    |Contacts|
        //    |CRM|
        //    |Sales|
        //    |Website|
        //    |Inventory|
        //    |Repair|
        //    |Events|
        //    |Employees|
        //    |Leaves|
        //    |Expenses     |
        //    |Maintenance  |
        //    |Dashboards   |
        // Assert.assertTrue(expectedModules.contains(actualModules));



    }



