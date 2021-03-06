package com.cydeo.libraryApp.pages;

import com.cydeo.libraryApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "nav")
    public WebElement dashBoard;

    @FindBy(xpath = "//span[text()='Users']")
    public WebElement btnUser;

    @FindBy(xpath = "//span[text()='Dashboard']")
    public WebElement btnDashboard;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement btnBooks;

    @FindBy(css = ".navbar-brand")
    public WebElement btnLibrary;

    @FindBy(css = "#navbarDropdown span")
    public WebElement btnUserAccount;

    @FindBy(css = ".dropdown-item")
    public WebElement btnLogOut;



}
