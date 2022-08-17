package com.cydeo.libraryApp.step_definitions;

import com.cydeo.libraryApp.pages.LibrarianBooksPage;
import com.cydeo.libraryApp.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_AddNewBook {
    LibrarianBooksPage librarianBooksPage = new LibrarianBooksPage();
    Faker faker = new Faker();
    String bookName;


    @When("librarian click +Add Book button")
    public void librarian_click_add_book_button() {
        librarianBooksPage.addBookBtn.click();

    }
    @When("librarian enter BookName, ISBN, Year, Author and Description")
    public void librarian_enter_book_name_isbn_year_author_and_description() {
        bookName = faker.name().fullName();
        librarianBooksPage.inputBookName.sendKeys(bookName);
        librarianBooksPage.inputIsbn.sendKeys(faker.idNumber().ssnValid());
        librarianBooksPage.inputYear.sendKeys(faker.date().toString());
        librarianBooksPage.inputAuthor.sendKeys(faker.name().fullName());
        librarianBooksPage.inputDescription.sendKeys(faker.superhero().descriptor());

    }
    @When("librarian click save changes")
    public void librarian_click_save_changes() {
        librarianBooksPage.saveChangesBtn.click();

    }
    @Then("verify a new book is added")
    public void verify_a_new_book_is_added() throws InterruptedException {
        BrowserUtils.waitForClickablility(librarianBooksPage.inputSearch, 5);
        librarianBooksPage.inputSearch.sendKeys(bookName);
        Thread.sleep(2000);
        Assert.assertEquals(bookName, librarianBooksPage.newBookRowOne.getText());

    }



}
