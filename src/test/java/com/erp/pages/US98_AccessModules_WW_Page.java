package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US98_AccessModules_WW_Page extends BasePage{

    @FindBy(xpath = "//span[.='POSManager22']")
    public WebElement posmanager;

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> modules;

}

