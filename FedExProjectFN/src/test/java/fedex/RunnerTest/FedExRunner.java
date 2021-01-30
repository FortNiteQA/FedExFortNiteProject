package fedex.RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class FedExRunner {

	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
			"json:target/cucumber-jsonreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
			features = {"src/test/resources/Features" }, 
			glue = { "fedex.StepDefinition" }, tags ={"@Sprint1"}, monochrome = true)

	public class RunCucumberTest extends AbstractTestNGCucumberTests {
		 
	}
}
