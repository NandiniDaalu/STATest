package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "features",
					glue= "StepDefinations",
					format = {"pretty", "html:target/cucumber"},
					plugin = {"html:target/cucumber-html-report"})

public class TestRunner
{
	
}