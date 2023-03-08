package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    public HeaderPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[.='ExpensesManager57']")
    public WebElement headerName;

    @FindBy(id="login")
    public WebElement email;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[.=\"Log in\"]")
    public WebElement loginButton;


    public void login(String userNameStr, String passwordStr) {
        email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginButton.click();

    }



}
