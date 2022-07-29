package com.cydeo.libraryApp.pages;

import com.cydeo.libraryApp.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageStudent {

    public BasePageStudent(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
