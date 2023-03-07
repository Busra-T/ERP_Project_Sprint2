package com.erp.step_definitions;

import com.erp.pages.DashBoardPage_Abu;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class RepairOrder_StepDefinition_Abu {
//RepairOrderPage_Abu repairOrderPage_abu=new RepairOrderPage_Abu();
    DashBoardPage_Abu dashBoardPage_abu=new DashBoardPage_Abu();
    Actions actions=new Actions(Driver.getDriver());
    @When("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("user enters valid enter valid {string} and {string}")
    public void user_enters_valid_enter_valid_and(String pos_email, String pos_password) {
        dashBoardPage_abu.email.sendKeys(ConfigurationReader.getProperty(pos_email));
       dashBoardPage_abu.password.sendKeys(ConfigurationReader.getProperty(pos_password));


    }
    @Then("user click on the login button")
    public void user_click_on_the_login_button() {
       dashBoardPage_abu.btn_logIn.click();

    }
    @Then("user should see Odoo")
    public void user_should_see_odoo() {
        String expectedTitleURL="Odoo";
        String actualTitleInURL=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitleInURL,expectedTitleURL);

    }
    @Then("user click on repair button")
    public void user_click_on_repair_button() {

        dashBoardPage_abu.repairsButton.click();


    }


    @Then("user should be able to select all the repair orders")
    public void user_should_be_able_to_select_all_the_repair_orders() {
        dashBoardPage_abu.checkBox.click();



    }


    @Then("user should see {string} login name on the page")
    public void userShouldSeeLoginNameOnThePage(String expectedText) {
        String actualHeaderText=dashBoardPage_abu.userName.getText();
        Assert.assertEquals(actualHeaderText,expectedText);




    }
    @When("user as sales_manager is on the login page")
    public void user_as_sales_manager_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Given("user as sales_manager is enters valid enter valid {string} and {string}")
    public void user_as_sales_manager_is_enters_valid_enter_valid_and(String sale_email, String sale_password) {
        dashBoardPage_abu.email.sendKeys(ConfigurationReader.getProperty(sale_email));
        dashBoardPage_abu.password.sendKeys(ConfigurationReader.getProperty(sale_password));


    }
    @Then("user as sales_manager click on the login button")
    public void user_as_sales_manager_click_on_the_login_button() {
        dashBoardPage_abu.btn_logIn.click();

    }
    @Then("user as sales_manager should see Odoo")
    public void user_as_sales_manager_should_see_odoo() {
        String expectedTitleURL="Odoo";
        String actualTitleInURL=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitleInURL,expectedTitleURL);

    }
    @Then("user as sales_manager click on repair button")
    public void user_as_sales_manager_click_on_repair_button() {
        dashBoardPage_abu.repairsButton.click();

    }
    @Then("user as sales_manager should be able to select all the repair orders")
    public void user_as_sales_manager_should_be_able_to_select_all_the_repair_orders() {
        dashBoardPage_abu.checkBox.click();
        BrowserUtils.sleep(5);
    }
    @Then("user as sales_manager should see {string} login name on the page")
    public void user_as_sales_manager_should_see_login_name_on_the_page(String string) {

        String expectedTitleURL="Repair Orders - Odoo";
        String actualTitleInURL=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitleInURL,expectedTitleURL);
        BrowserUtils.sleep(5);

    }




    }


