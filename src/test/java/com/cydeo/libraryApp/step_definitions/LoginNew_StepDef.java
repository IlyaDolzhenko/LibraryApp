package com.cydeo.libraryApp.step_definitions;

import com.cydeo.libraryApp.pages.BasePage;
import com.cydeo.libraryApp.pages.LoginPage;
import com.cydeo.libraryApp.utilities.ConfigurationReader;
import com.cydeo.libraryApp.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class LoginNew_StepDef {

    Faker faker = new Faker();
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("librarian is on the loginPage")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app.url"));

    }
    @Then("verify that the title is {string}")
    public void verify_that_the_title_is(String title) {
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }
    @When("librarian enters valid email address and password")
    public void librarian_enters_valid_email_address_and_password() {
        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("username.librarian"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password.librarian"));

    }
    @When("librarian clicks sign in button")
    public void librarian_clicks_sign_in_button() {
        loginPage.btnSignIn.click();
    }
    @Then("verify that there are {int} models on the page")
    public void verify_that_there_are_models_on_the_page(Integer ExpectedModels) {
        Integer actualModels = basePage.models.size();
        Assert.assertEquals(ExpectedModels, actualModels);
    }

    @Given("student is on the loginPage")
    public void student_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app.url"));
    }
    @Then("verify that the URL is {string}")
    public void verify_that_the_url_is(String expectedURL) {
        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());
    }
    @When("When student enters valid email address and password")
    public void when_student_enters_valid_email_address_and_password() {
        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("username.student"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password.student"));
    }
    @When("student clicks sign in button")
    public void student_clicks_sign_in_button() {
        loginPage.btnSignIn.click();
    }
    @Then("Then verify that there are {int} models on the page")
    public void then_verify_that_there_are_models_on_the_page(Integer ExpectedModels) {
        Integer actualModels = basePage.models.size();
        Assert.assertEquals(ExpectedModels, actualModels);
    }


    @Given("user is on the loginPage")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app.url"));

    }
    @When("user enters invalid email address or password")
    public void user_enters_invalid_email_address_or_password() {
        loginPage.inputEmail.sendKeys(faker.internet().emailAddress());
        loginPage.inputPassword.sendKeys(faker.internet().password());
    }

    @Then("verify the error message {string}")
    public void verify_the_error_message(String errorMsg) {
        Assert.assertEquals(errorMsg, loginPage.errorMsg.getText());


    }
}
