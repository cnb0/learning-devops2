@catalog
Feature: Movie Search
	In order to improve catalog usability and customer satisfaction
	As a movie enthusiast
	I want to search movie titles in the catalog by keyword
	
	Background:
		Given these movies exist:
			| title				| producer				| releaseDate		|
			| Avatar			| 20th Century Fox		| 18 December 2009 	|
			| Out of Africa 	| Universal Pictures 	| 20 December 1985 	|
			| Inside Out 		| Pixar 				| 19 June 2015 		|
			| Layer Cake        | Sony Pictures         | 6 May 2005        |
			
	@movieSearch @tag1	
	Scenario Outline: Search movies by title
		When the customer searches for movies with the keyword '<keyword>'
		Then <movieCount> movies should have been found
		And the catalog should have 3 total movies
		Examples:
		| keyword | movieCount |
		| out     | 2          |
		| Africa  | 1          |
		| Inside  | 1          |
		| Monkey  | 0          |
	
	@movieSearch @tag2
	Scenario: Search movies by order
		When the customer searches for the third movie
		Then 1 movie should have been found
		And the movie title should be 'Inside Out'
