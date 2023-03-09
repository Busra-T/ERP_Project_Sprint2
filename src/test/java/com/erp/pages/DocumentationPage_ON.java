package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DocumentationPage_ON extends BasePage{
    @FindBy(tagName = "h1")
    public WebElement message;

    @FindBy(tagName = "h2")
    public List<WebElement> headers;

    public void ClickMenu(String linkText){
        WebElement element = Driver.getDriver().findElement(By.partialLinkText(linkText));
        element.click();
    }
}
