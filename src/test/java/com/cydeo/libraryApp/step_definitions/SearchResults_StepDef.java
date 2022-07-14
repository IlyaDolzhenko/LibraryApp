package com.cydeo.libraryApp.step_definitions;

import com.cydeo.libraryApp.pages.BasePage;
import com.cydeo.libraryApp.pages.LoginPage;
import com.cydeo.libraryApp.pages.UserManagementPage;
import com.cydeo.libraryApp.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class SearchResults_StepDef {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    UserManagementPage userManagementPage = new UserManagementPage();

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.login(ConfigurationReader.getProperty("username.librarian"),
                ConfigurationReader.getProperty("password.librarian"));
        loginPage.btnSignIn.click();
    }

    @Given("I click on {string} link")
    public void i_click_on_link(String button) {

        switch (button.toLowerCase()) {
            case "users":
                basePage.btnUser.click();
                break;
            case "books":
                basePage.btnBooks.click();
                break;
            case "dashboard":
                basePage.btnDashboard.click();
                break;
        }
    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedTableHeader) {

        for (int i = 0; i < expectedTableHeader.size(); i++) {
            Assert.assertEquals("Table header verification test FAILED", expectedTableHeader.get(i), userManagementPage.tableHeader.get(i).getText());
        }

    }

}
