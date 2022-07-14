package com.cydeo.libraryApp.pages;

import com.cydeo.libraryApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserManagementPage extends BasePage{

    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th[text()='Actions']")
    public WebElement tableActions;

    @FindBy(css = "[data-name = 'email']")
    public WebElement tableEmail;

    @FindBy(css = "[data-name = 'group_name']")
    public WebElement tableGroup;

    @FindBy(css = "[data-name = 'id']")
    public WebElement tableUserId;

    @FindBy(css = "[data-name = 'status']")
    public WebElement tableStatus;

    @FindBy(css = "[data-name = 'full_name']")
    public WebElement tableFullNAme;

    @FindBy(xpath = "//table//tr/th")
    public List<WebElement> tableHeader;

}
