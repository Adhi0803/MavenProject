Feature: 
This feature will test the end to end functionality of the district in application

Background:
Given I am on the District.in home page
When I click on the Search icon
And I click on the Movies link


@RegressionTest
Scenario:
Booking of a movie ticket

And I enter "Dhurandhar" in the search box
Then I should see the search results for "Dhurandhar123"

@SmokeTest
Scenario Outline: 
Search a movie

And I enter "<movieName>" in the search box
Then I should see the search results for "<searchResult"

Examples:
|movieName|searchResult|
|Dhurandhar|Dhurandhar|
|Hoopers|Hoopers|
|Super Duper|Super Duper123|
