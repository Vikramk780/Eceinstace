package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Features/",
		glue= "StepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumberReports/reportsHtml.html","json:target/cucumberReports/reportsJson.json","junit:target/cucumberReports/reportsJunit.xml"}
		)

//"junit:target/cucumberReports/reportsJunit.xml"
public class Run {

}
