package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.US100_PosOrdersFunction_BT_Page;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US100_PosOrdersFunction_BT_StepDefinitions extends BasePage {

    US100_PosOrdersFunction_BT_Page page=new US100_PosOrdersFunction_BT_Page();
    @When("user logged in as POS manager")
    public void userLoggedInAsPOSManager() {
        login("posmanager19@info.com","posmanager");
    }

    @And("user clicks on Point of Sale")
    public void userClicksOnPointOfSale() {
        BrowserUtils.waitForClickablility(page.opt_POS,3);
        page.opt_POS.click();
    }

    @Then("user clicks on orders")
    public void userClicksOnOrders() {
        BrowserUtils.waitForClickablility(page.opt_orders,4);
        page.opt_orders.click();
    }

    @Then("user clicks Order Ref checkbox")
    public void userClicksOrderRefCheckbox() {
        page.cbox_orderRef.click();
    }

    @Then("user sees all orders are checked")
    public void userSeesAllOrdersAreChecked() {

        for (WebElement each : page.checks) {
            Assert.assertTrue(each.isSelected());
        }
        //Assert.assertTrue(checks.size()==60);
    }

    @Then("user sees the Action dropdown")
    public void userSeesTheActionDropdown() {
        Assert.assertTrue(page.dropdown_action.isDisplayed());
    }

    @And("user clicks on Action dropdown")
    public void userClicksOnActionDropdown() {
        page.dropdown_action.click();
    }

    @Then("user sees the below options")
    public void userSeesTheBelowOptions(List<String>actionOpts) {


        for (WebElement each : page.actionOptions) {
            for (String eachText : actionOpts) {
                Assert.assertTrue(each.getText().contains(eachText));
            }
        }


    }
}
