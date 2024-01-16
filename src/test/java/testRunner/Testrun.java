package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
			
	features="Features//swiggy.feature",
	//tags= {"@Sanity"}, //single tag execution
	//tags= {"@Sanity,@Regression"}, //multiple tag execution
	glue="stepDefinition",
	dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:target/Reports"}
	
	)


public class Testrun {

}

