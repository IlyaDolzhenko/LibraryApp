package com.cydeo.libraryApp.step_definitions;

import com.cydeo.libraryApp.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //@Before is coming from Cucumber. It is running before each Scenario
    @Before
    public void setUp() {
        System.out.println("--> Before Scenario is running in Hooks");
    }

    //@After is coming from Cucumber. It is running after each Scenario
    @After
    public void tearDown(Scenario scenario) {
        System.out.println("--> After Scenario is running in Hooks");

        if (scenario.isFailed()) { //Takes a screenshot evidence if Scenario fails and attaches it to HTML report
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver(); //Closes the Browser
    }

}
