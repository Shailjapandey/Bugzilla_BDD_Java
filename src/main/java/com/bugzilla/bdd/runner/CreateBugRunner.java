package com.bugzilla.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/main/java/com/bugzilla/bdd/feature/CreateBug.feature"}, //the path of the feature files
		glue= {"com.bugzilla.bdd.stepdfn"},
		dryRun= false,
		monochrome = true,
		plugin = {"pretty","html:target/HTMLReport"})
public class CreateBugRunner extends AbstractTestNGCucumberTests {

}
