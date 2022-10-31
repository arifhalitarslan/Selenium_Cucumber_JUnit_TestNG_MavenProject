package com.project.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/FeatureFile",
        glue = "com/project/StepDefinitions",
        tags = "@wip",
        plugin = "html:target/cucumber-reports.html",
        dryRun = false

)
public class CukesRunner {

}
