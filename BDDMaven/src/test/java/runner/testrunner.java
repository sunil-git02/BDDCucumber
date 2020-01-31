package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 

@CucumberOptions(
		features = "/BDDMaven/src/test/java/features/test1.feature"
		,glue= "stepdefination",
		
		plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome = true

		
		)

public class testrunner {

}
