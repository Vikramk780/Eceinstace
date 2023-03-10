package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "./Features/",
		glue= "StepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumberReports/reportsHtml.html","json:target/cucumberReports/reportsJson.json","junit:target/cucumberReports/reportsJunit.xml"}
		)

//"junit:target/cucumberReports/reportsJunit.xml"
public class Run extends AbstractTestNGCucumberTests{

}

