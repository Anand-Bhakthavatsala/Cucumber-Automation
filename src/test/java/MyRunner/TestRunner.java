package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	features="E:\\eclipse-workspace\\Cucumber-Automation\\src\\test\\java\\Features\\testproject.feature",
	glue= {"stepDefinitions",
	
	}	
)

public class TestRunner {

	
}
