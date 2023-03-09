package com.erp.step_definitions;

import com.erp.pages.DocumentationPage_ON;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class DocumentationAccess_ON {
    DocumentationPage_ON documentationPage_on = new DocumentationPage_ON();

    @Given("user is logged inside")
    public void user_is_logged_in() {
        documentationPage_on.login("posmanager10@info.com", "posmanager");
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String linkText) {
        documentationPage_on.ClickMenu(linkText);
    }

    @When("user clicks {string} option")
    public void user_clicks_option(String menuOption) {
        String mainHandle = Driver.getDriver().getWindowHandle();
        BrowserUtils.sleep(2);
        documentationPage_on.ClickMenu(menuOption);

        BrowserUtils.sleep(1);

        Set<String> windows = Driver.getDriver().getWindowHandles();

        for (String window : windows) {
            Driver.getDriver().switchTo().window(window);
        }
    }

    @Then("user sees  {string} in the url")
    public void user_sees_in_the_url(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }

    @Then("user sees {string} message is displayed")
    public void user_sees_message_is_displayed(String string) {
        Assert.assertTrue(documentationPage_on.message.isDisplayed());
        Assert.assertEquals(documentationPage_on.message.getText(), string);
    }

    @Then("there are {int} main documents topics are listed")
    public void there_are_main_documents_topics_are_listed(Integer int1) {
        Assert.assertTrue(documentationPage_on.headers.size() == int1);
    }

}
