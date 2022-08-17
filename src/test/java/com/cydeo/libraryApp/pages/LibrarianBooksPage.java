package com.cydeo.libraryApp.pages;

import com.cydeo.libraryApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianBooksPage {

    public LibrarianBooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    public WebElement addBookBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputBookName;

    @FindBy(xpath = "//input[@name='isbn']")
    public WebElement inputIsbn;

    @FindBy(xpath = "//input[@name='author']")
    public WebElement inputAuthor;

    @FindBy(xpath = "//input[@name='year']")
    public WebElement inputYear;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement inputDescription;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveChangesBtn;

    @FindBy(xpath = "//table[@id='tbl_books']//tr//td[3]")
    public WebElement newBookRowOne;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement inputSearch;





}
