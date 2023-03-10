package com.erp.step_definitions;

import com.erp.pages.US96_SalesColumns_AO_Page;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US96_SalesColumns_AO_StepDefinitions {

    US96_SalesColumns_AO_Page finasystemsPage = new US96_SalesColumns_AO_Page(); // create the object from US96_AO page under"pages"

    @When("Manager will log in to page.")
    public void manager_will_log_in_to_page() {

        finasystemsPage.login("posmanager11@info.com","posmanager");

    }


    @Given("Click to Sales tab on the top")
    public void click_to_sales_tab_on_the_top() {
        finasystemsPage.salesTab.click();

    }


    @Then("Manager should see below quotations")
    public void managerShouldSeeBelowQuotations(List<String> expectedQuotations) { // we call thhe expectedQuotes from feature file

        List <String> actualColumns = new ArrayList<>();// we create new ArrayList to store actual columns texts.
        for (WebElement each : finasystemsPage.columns) { // we use for each loop in order to go thru the each columns header.
            Assert.assertTrue(expectedQuotations.contains(each.getText()));
        }

        //Assert.assertEquals(expectedQuotations,actualColumns);

    }


    @Then("Check if log in name appears on the corner")
    public void check_if_log_in_name_appears_on_the_corner_wearers_right_hand_side() {
    String actualName= finasystemsPage.ManagerInfo.getText();
    String expectedName= "POSManager11";

    Assert.assertTrue(actualName.equals(expectedName) );



    }

    @Then("Manager sees {string}")
    public void managerSees(String Salesperson) {
        BrowserUtils.sleep(3);
      String actualText =  finasystemsPage.SalesPerson.getText();
      Assert.assertEquals(Salesperson,actualText);

    }
}
