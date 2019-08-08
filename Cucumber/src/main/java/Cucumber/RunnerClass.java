package Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "resources", glue = "Cucumber", monochrome = true, plugin = { "pretty",
		"html:cucumber-html-report" }, tags = { "@Login" }, dryRun = false)

public class RunnerClass extends AbstractTestNGCucumberTests {

}
