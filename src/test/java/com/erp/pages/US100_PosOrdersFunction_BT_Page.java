package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US100_PosOrdersFunction_BT_Page {

    public US100_PosOrdersFunction_BT_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@data-menu-xmlid='point_of_sale.menu_point_root']")
    public WebElement opt_POS;

    @FindBy(xpath = "//a[@data-menu-xmlid='point_of_sale.menu_point_ofsale']")
    public WebElement opt_orders ;

    @FindBy(xpath = "//th[@class='o_list_record_selector']")
    public WebElement cbox_orderRef;

    @FindBy(xpath = "//td/div/input[@type='checkbox']")
    public WebElement allOrders ;

   public List<WebElement> checks= Driver.getDriver().findElements(By.xpath("//td/div/input[@type='checkbox']"));


    @FindBy(xpath = "(//div[@class=\"btn-group o_dropdown\"])[2]")
    public WebElement action;

    @FindBy(xpath = "//ul//a[contains(.,\"Export\")]")
    public WebElement export;

    @FindBy(xpath = "//ul//a[contains(.,\"Delete\")]")
    public WebElement delete;


  /*  @FindBy()
    public WebElement ; */
}
