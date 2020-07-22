package feature.google;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * This class allows Cucumber tests to be run within the JUnit test harness. That 
 * means Cucumber test results can be viewed in the JUnit window and can be run
 * using <code>mvn test</code>.
 * <p />
 * 
 * Pro tip: if you want this class to get picked up by Maven as a test, end the name
 * of the class with the word <code>Test</code> so Maven will run it as a test.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true, 
		plugin = {"pretty", "html:target/report"},
		features = "src/test/resources/feature/google",
		glue = "feature.google",
		stepNotifications = true)
public class GoogleSearchTest {
	//NOOP - just need the class annotations
}
