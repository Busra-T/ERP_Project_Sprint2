package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.US108_SalesExpensesLogin_BT_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US108_SalesExpensesLogin_BT_StepDefinitions {

    US108_SalesExpensesLogin_BT_Page page=new US108_SalesExpensesLogin_BT_Page();
    @When("Users login with their {string} and {string}")
    public void usersLoginWithTheirAnd(String email, String password) {
        page.login(email, password);
    }

    @Then("Users see the correct {string}")
    public void usersSeeTheCorrect(String accountName) {
        Assert.assertEquals(accountName,page.accountHolder.getText());

    }

}
