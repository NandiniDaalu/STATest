@tag
Feature: Login Modue tests
  I want to Login successfully to Brighttalk home page 

  @tag1
  Scenario: Login to Brighttalk login page successfully 
    Given I am on the given url
    When I enter authorised "<emailid>" & "<password>"
    And I click on Login button 
    Then I am redirected to BrightTalk home page
 
 Examples:
	 | emailid       | | password |
	 | Nandiniiimane@gmail.com | | ********* |


  @tag2
  Scenario Outline: Login to Brightalk login page with invalid credentials 
 Given I am on the given url
    When I enter unauthorised "<emailid>" & "<password>"
    And I click on Login button 
    Then I get an error message as 'Incorrect email or password, please try again.'
 
 Examples:
	 | emailid       | | password |
	 | Nandi@*(&gmail.com| | ********* |
	  |i@*(&gmail.com| | ********* |
	   | Nandi@POPPY.com| | ********* |
	    | Nandi@*(&gmail | | ********* |
	    | Nandiigmail.com | | ********* |
	    

 @tag2
  Scenario Outline: Login to Brightalk login page and Join as a new user by passing valid values
 Given I am on the given url
    When I click on Join Now button
    And I enter valid values in the form 
    And I click on Join Now button 
    Then I am redirected to Brighttalk home page 
    
   @tag2
  Scenario Outline: Login to Brightalk login page and Join as a new user with 1 or more invalid values 
 Given I am on the given url
    When I click on Join Now button
    And I enter invalid values in the form 
    And I click on Join Now button 
    Then I am redirected to Brighttalk home page 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  