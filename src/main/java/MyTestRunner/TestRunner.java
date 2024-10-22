package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Features/Hooks.feature", 
 					glue = {"StepDefinitions"}, 
 					monochrome = true, 
 					plugin = {"pretty", "html:report_html/cucmber.html","json:report_json/cucumber.json","junit:report_xml/cucumber.xml" }, 
 					dryRun = true	
// 					tags = "@smoke"
)

public class TestRunner {	

}
