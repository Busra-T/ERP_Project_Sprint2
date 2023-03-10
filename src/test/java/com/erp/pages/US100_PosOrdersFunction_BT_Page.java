package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US100_PosOrdersFunction_BT_Page {

    public US100_PosOrdersFunction_BT_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@data-menu-xmlid='point_of_sale.menu_point_root']")
    public WebElement opt_POS;


    @FindBy(xpath = "(//a[contains(.,'Orders')])[6]")
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

    @FindBy(xpath = "//button[contains(.,'Action')]" )
    public WebElement dropdown_action ;


    public List<WebElement> actionOptions=Driver.getDriver().findElements(By.xpath("(html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li/a)"));




}
