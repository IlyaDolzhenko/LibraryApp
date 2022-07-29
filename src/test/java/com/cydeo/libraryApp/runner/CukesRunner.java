package com.cydeo.libraryApp.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "pretty", //Prints additional information about the Scenario that is being executed
                "json:target/cucumber.json", //Creates cucumber report for Jenkins with .json
                "html:target/cucumber-reports.html", //Makes HTML reports
                "rerun:target/rerun.txt", //Keeps tracking of FAILED Scenarios in .txt file
                "me.jvt.cucumber.report.PrettyReports:target/cucumber" //Creates Cucumber report
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/libraryApp/step_definitions",
        publish = true,
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
