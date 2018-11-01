@Featuretest
Feature: Login to CRM page

@Scenario
  Scenario Outline: User sign up by passing incorrect email address
    Given User is on amazon page and click on signup button
    When User enters incorect "<EmailID>" in the emailid field
    And User also enters password in the password field
    And User clicks on the Signup button
    Then User gets an error messsage
    
    Examples:
    | EmailID |
    | hciuweicbcccuciw*798$3 |
    | $$**%%@google.com |
    | Nandini&google.com |
    | Nandini@yahoo.co.in.in |
    | Nandini@**$$.com |
    
