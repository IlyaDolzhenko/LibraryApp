package com.cydeo.libraryApp.pages;

import com.cydeo.libraryApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianUsersPage {

    public LibrarianUsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()=' Add User']")
    public WebElement addUserBtn;

    @FindBy(xpath = "//a[text()=' Add User']")
    public WebElement BtnAddUser;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement inputFullNAme;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement inputEmail;

    @FindBy(id = "address")
    public WebElement inputAddress;

    @FindBy(xpath = "//button[text()='Save changes']")
    public WebElement btnSaveChanges;

    @FindBy(xpath = "(//table/tbody/tr/td)[3]")
    public WebElement newUserRowOne;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement popUpVerify;




}
