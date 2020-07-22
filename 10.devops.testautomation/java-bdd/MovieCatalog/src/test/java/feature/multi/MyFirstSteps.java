package feature.multi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/**
 * This step definitions class will handle part of the BDD scenario steps.
 */
public class MyFirstSteps {

	private String message;
	
	
	@Given("this step is defined in my first step definition class")
	public void this_step_is_defined_in_my_first_step_definition_class() {
		message = "We are in the first step definition class.";
		System.out.println("[MyFirstSteps] message = " + message);
	}
	
	@When("I run this scenario")
	public void i_run_this_scenario() {
	    System.out.println("[MyFirstSteps] I RUN THIS SCENARIO");
	}

}
