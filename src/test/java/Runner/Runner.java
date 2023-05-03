package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = "Steps", tags = "@contaneon", plugin = { "pretty",
		"html: target/report.html" }, monochrome = true, dryRun = false

)
public class Runner {

}
