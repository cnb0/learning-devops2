package feature.multi;

import static org.junit.Assert.assertNotNull;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * This step definitions class will handle part of the BDD scenario steps.
 */
public class MySecondSteps {
	
	private String message;
	
	/**
	 * Before method that will run before each scenario.
	 */
	@Before
	public void beforeSecondStepsFile() {
		System.out.println("[MySecondSteps] ******** BEFORE ********");
	}
	
	/**
	 * After method that will run after each scenario.
	 */
	@After
	public void afterSecondStepsFile() {
		System.out.println("[MySecondSteps] ********** AFTER ********");
	}
	
	@Given("this step is defined in my second step definition class")
	public void this_step_is_defined_in_my_second_step_definition_class() {
	    System.out.println("[MySecondSteps] THIS STEP IS DEFINED IN MY SECOND STEP DEFINITION CLASS");
	}
	
	@Then("the scenario still works")
	public void the_scenario_still_works() {
	    System.out.println("[MySecondSteps] THE SCENARIO STILL WORKS");
	}

	@Then("the scenarios can access all the state they need to perform")
	public void the_scenarios_can_access_all_the_state_they_need_to_perform() {
		assertNotNull(message);
	    System.out.println("[MySecondSteps] message = " + message);
	}
	
}
