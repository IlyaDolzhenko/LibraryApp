package com.cydeo.libraryApp.step_definitions;

import com.cydeo.libraryApp.pages.MainPage;
import com.cydeo.libraryApp.pages.LoginPage;
import com.cydeo.libraryApp.utilities.ConfigurationReader;
import com.cydeo.libraryApp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDef {

    LoginPage loginPage = new LoginPage();
    MainPage librarianMainPage = new MainPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app.url"));
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("username.librarian"));
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password.librarian"));
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("username.student"));
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password.student"));
    }


    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        loginPage.btnSignIn.click();
        Assert.assertTrue("Login test is FAILED!", loginPage.dashBoard.isDisplayed());
    }

    @When("I login using {string} and {string}")
    public void i_login_using_and(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("there should be {int} {string}")
    public void there_should_be(Integer expectedNumUsers) {
        Assert.assertEquals("User count test is FAILED", expectedNumUsers.toString(), librarianMainPage.userCount.getText());
    }

}
