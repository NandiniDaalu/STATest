@Featuretest
Feature: Login to CRM page

  @Scenario
  Scenario Outline: User sign up by passing incorrect email address
    Given User is on amazon page and click on signup button
    When User enters incorect "<EmailID>" and "<Password>"
    And User clicks on the Signup button
    Then User gets an error messsage

    Examples: 
      | EmailID                |  | Password     |
      | hciuweicbcccuciw*798$3 |  | QWERTY123!@# |
