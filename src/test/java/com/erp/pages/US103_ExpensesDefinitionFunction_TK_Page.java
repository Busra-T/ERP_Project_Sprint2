package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US103_ExpensesDefinitionFunction_TK_Page {

    public US103_ExpensesDefinitionFunction_TK_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "login")
    public static WebElement inputUsername;

    @FindBy(name = "password")
    public static WebElement inputPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public static WebElement loginButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li/a/span")
    public static List<WebElement> ModulesAccessButtons;

    @FindBy(xpath = "//a[@data-menu-xmlid='calendar.mail_menu_calendar']")
    public static WebElement calenderButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='note.menu_note_notes']")
    public static WebElement notesButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='contacts.menu_contacts']")
    public static WebElement contactsButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='website.menu_website_configuration']")
    public static WebElement websiteButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='event.event_main_menu']")
    public static WebElement eventsButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='hr.menu_hr_root']")
    public static WebElement employeesButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='hr_holidays.menu_hr_holidays_root']")
    public static WebElement leavesButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='hr_expense.menu_hr_expense_root']")
    public static WebElement expensesButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='lunch.menu_lunch']")
    public static WebElement lunchButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public static WebElement okButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='maintenance.menu_maintenance_title']")
    public static WebElement maintenanceButton;

    @FindBy(xpath = "//a[@data-menu-xmlid='base.menu_board_root']")
    public static WebElement dashboardsButton;



}
