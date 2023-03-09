package com.erp.step_definitions;

import com.erp.pages.Calendar_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Calendar_US109TT {


    Calendar_Page page = new Calendar_Page();

    @Given("User is logged in")
    public void user_is_logged_in() {

        page.login("posmanager16@info.com", "posmanager");

    }
    @Given("User should click on Calendar page")
    public void user_should_click_on_calendar_page() {
        page.calendarButton.click();

    }
    @Then("User should verify calendar time list starting from {string} til {string}, and is increased by one hour")
    public void user_should_verify_calendar_time_list_starting_from_til_and_is_increased_by_one_hour(String string1, String string2, List<String> time ) {

        List<String> textList = new ArrayList<String>();


        for (WebElement element : page.tables) {
            textList.add(element.getText());
        }

        Assert.assertEquals(string1,(textList.get(0)));
        Assert.assertEquals(string2,(textList.get(textList.size()-1)));
        Assert.assertEquals(time,textList);
    }

}
