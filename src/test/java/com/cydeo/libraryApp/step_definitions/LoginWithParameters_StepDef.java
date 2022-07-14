package com.cydeo.libraryApp.step_definitions;

import com.cydeo.libraryApp.pages.MainPage;
import com.cydeo.libraryApp.pages.LoginPage;
import com.cydeo.libraryApp.utilities.ConfigurationReader;
import com.cydeo.libraryApp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParameters_StepDef {

    LoginPage loginPage = new LoginPage();
    MainPage librarianMainPage = new MainPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app.url"));
    }

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        loginPage.inputEmail.sendKeys(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        Assert.assertTrue("Login test is FAILED - Dashboard is NOT Displayed", loginPage.dashBoard.isDisplayed());
    }


    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.btnSignIn.click();
    }

    @Then("there should be {int} users")
    public void there_should_be_users(Integer numberOfUsers) {
        Assert.assertEquals("User count test is FAILED", numberOfUsers.toString(), librarianMainPage.userCount.getText());
    }

}
