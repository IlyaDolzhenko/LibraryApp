package com.cydeo.libraryApp.pages;

import com.cydeo.libraryApp.utilities.ConfigurationReader;
import com.cydeo.libraryApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(css = "button")
    public WebElement btnSignIn;

    public void login (String email, String password){
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        btnSignIn.click();
    }

    @FindBy(xpath = "//div[text()='Sorry, Wrong Email or Password']")
    public WebElement errorMsg;

    public void login(String login) {
        switch (login) {
            case "librarian":
            case "Librarian":
                inputEmail.sendKeys(ConfigurationReader.getProperty("username.librarian"));
                inputPassword.sendKeys(ConfigurationReader.getProperty("password.librarian"));
                btnSignIn.click();
                break;

            case "student":
            case "Student":
                inputEmail.sendKeys(ConfigurationReader.getProperty("student.librarian"));
                inputPassword.sendKeys(ConfigurationReader.getProperty("student.librarian"));
                btnSignIn.click();
                break;
        }
    }


}
