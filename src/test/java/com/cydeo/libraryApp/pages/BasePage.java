package com.cydeo.libraryApp.pages;

import com.cydeo.libraryApp.utilities.Driver;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//li[@class='nav-item']")
    public List<WebElement> models;

        public void clickModels(String model){
            for (WebElement element : models){
                if (element.getText().equalsIgnoreCase(model)){
                    element.click();
                }
            }
        }



}
