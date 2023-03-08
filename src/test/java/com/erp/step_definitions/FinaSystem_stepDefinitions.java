package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.HeaderPage;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FinaSystem_stepDefinitions {

    HeaderPage headerPage = new HeaderPage();

    @Given("user is on the login page of the Fina System application")
    public void user_is_on_the_login_page_of_the_fina_system_application() {

        Driver.getDriver().get("https://qa.finasystems.net/");



    }
    @When("user enters username")
    public void user_enters_username() {

        headerPage.email.sendKeys(ConfigurationReader.getProperty("userEmail"));

    }
    @When("user enters password")
    public void user_enters_password() {

        headerPage.password.sendKeys(ConfigurationReader.getProperty("userPassword"));
        headerPage.loginButton.click();

    }


    @Then("user should see {string} header name on the page")
    public void userShouldSeeHeaderNameOnThePage(String expectedHeaderName) {

        String actualHeaderName = headerPage.headerName.getText();

        Assert.assertEquals(actualHeaderName, expectedHeaderName);

    }
}