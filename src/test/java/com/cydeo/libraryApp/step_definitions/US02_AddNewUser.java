package com.cydeo.libraryApp.step_definitions;

import com.cydeo.libraryApp.pages.BasePage;
import com.cydeo.libraryApp.pages.LibrarianUsersPage;
import com.cydeo.libraryApp.pages.LoginPage;
import com.cydeo.libraryApp.utilities.BrowserUtils;
import com.cydeo.libraryApp.utilities.ConfigurationReader;
import com.cydeo.libraryApp.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_AddNewUser {
    Faker faker = new Faker();
    String fullName;
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    LibrarianUsersPage librarianUsersPage = new LibrarianUsersPage();


    @Given("{string} is on the homePage")
    public void is_on_the_home_page(String login) {
        Driver.getDriver().get(ConfigurationReader.getProperty("app.url"));
        loginPage.login(login);
    }

    @When("librarian click {string} module")
    public void librarian_click_module(String module){
        basePage.clickModels(module);

    }
    @When("librarian click +Add User button")
    public void librarian_click_button() {
        librarianUsersPage.addUserBtn.click();

    }
    @When("librarian enter full name, password, email and address")
    public void librarian_enter_full_name_password_email_and_address() {
        fullName = faker.name().fullName();
        librarianUsersPage.inputFullNAme.sendKeys(fullName);
        librarianUsersPage.inputPassword.sendKeys(faker.internet().password());
        librarianUsersPage.inputEmail.sendKeys(faker.internet().emailAddress());
        librarianUsersPage.inputAddress.sendKeys(faker.address().fullAddress());
        librarianUsersPage.btnSaveChanges.click();

    }
    @Then("verify a new user is created")
    public void verify_a_new_user_is_created(){
        BrowserUtils.waitForInvisibilityOf(librarianUsersPage.newUserRowOne);
        Assert.assertEquals(fullName, librarianUsersPage.newUserRowOne.getText());

    }
}
