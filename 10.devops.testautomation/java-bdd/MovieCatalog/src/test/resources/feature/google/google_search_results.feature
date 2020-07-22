@browser
Feature: Search result placement for The Hartford
	In order to ensure that our customers find us immediately in Google search results
	As The Hartford online marketing team
	I want The Hartford to be the first organic search result when searching our name
	
	Scenario: Search 'The Hartford'
		Given I'm on the Google home page
		And I enter 'The Hartford' as search criteria
		When I perform the search
		Then I see the text 'https://www.thehartford.com' in the first search result
	
	Scenario: Search 's/v hello world'
		Given I'm on the Google home page
		And I enter 's/v hello world' as search criteria
		When I perform the search
		Then I see the text 'blog.svhelloworld.com' in the first search result
		