Feature: Steps defined in multiple step definition classes
	As a Cucumber ninja
	I want to define step definitions in multiple step classes
	So that I can organize my step definition classes better
	
	Scenario: steps across multiple files!
		Given this step is defined in my first step definition class
		And this step is defined in my second step definition class
		When I run this scenario
		Then the scenario still works
		And the scenarios can access all the state they need to perform
	
	Scenario: steps across multiple files!
		Given this step is defined in my first step definition class
		And this step is defined in my second step definition class
		When I run this scenario
		Then the scenario still works
		And the scenarios can access all the state they need to perform
		
