package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EventManagerPageEM extends BasePage{

    public EventManagerPageEM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a/span")
    public List<WebElement> ModulesAccessButtons;
}
