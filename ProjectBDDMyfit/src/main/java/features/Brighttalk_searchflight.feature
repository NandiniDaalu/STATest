
@tag
Feature: Search the cheapest airfare

  @tag1
  Scenario: Search for the cheapest flight and book it
    Given I am on the Home page and i click on Flights tab
    When I select From address as London city airport from the dropdown 
    And I select the Return address as Dubai international airport from the dropdown
    And I select the Roundtrip radio button 
    And I select the from date as 2 weeks from today and return date as 2 weeks later
    And I click on Guests icon and select 2 from Adults checkbox & 2 from Child checkbox     
		And I click on Search button and I am redirected to list of available flights 
    And I filter the search by clicking on Turkish airlines and omar air
    And I get the search results and i select the cheapest airfare by clicking on BookNow button
    Then I am redirected to booking page 

 