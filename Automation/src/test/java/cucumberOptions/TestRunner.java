package cucumberOptions;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src/test/java"},
		glue = {"stepDefination"}
		)
public class TestRunner {

}
