package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Calendar_Page extends BasePage {


    @FindBy(xpath = "//a[@data-action-id='120']")
    public WebElement discuss;

    @FindBy(xpath = "//a[@data-action-id='136']")
    public WebElement calendarButton;

    @FindBy(xpath = "//div[@class='fc-slats']//tbody//tr//span")
    public List<WebElement> tables;

}
