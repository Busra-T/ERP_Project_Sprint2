package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage_Abu extends BasePage {


    public DashBoardPage_Abu(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']")
    public WebElement repairsButton;

    @FindBy(xpath = "//li[.='Repair Orders']")
    public WebElement header;

@FindBy(xpath = "(//input[@type='checkbox'])[3]")
public WebElement checkBox;
@FindBy(xpath = "//span[.='POSManager13']")
    public WebElement userName;





}


