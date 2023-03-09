package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US97_RepairsOrder_BHA_Page extends BasePage {
    public US97_RepairsOrder_BHA_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

   // @FindBy(xpath ="//li[@class='active']//span")
   // public WebElement Repairs;


    @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']")
    public WebElement Repairs;




    @FindBy(xpath="//th[@class='o_column_sortable']")
    public List<WebElement> columns;

    @FindBy(xpath ="//span[.='POSManager11']" )
    public WebElement posManager;



}
