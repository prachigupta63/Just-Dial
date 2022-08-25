package Com.Automation.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\prachi.gupta2\\eclipse-workspace\\JustDial_Testing\\src\\test\\resources\\feature\\verifyLogin.feature"}, 
glue = "Com.Automation.StepDef", plugin = {
		"html:reports/reports.html", "json:target/cucumber.json", "rerun:target/rerun.txt"}, tags = "@Smoke and @Regression and  @Unit and @Test")

public class Testrunner {

}