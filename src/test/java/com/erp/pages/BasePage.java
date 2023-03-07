package com.erp.pages;


import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {



    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="login")
    public WebElement email;


    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[.=\"Log in\"]")
    public WebElement btn_logIn;



    //ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a
    // ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a/span
    public void login(String userNameStr, String passwordStr) {
        email.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        btn_logIn.click();
        // verification that we logged
    }










}
