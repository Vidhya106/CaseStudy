#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SignIn
  
  
  Scenario Outline: User Login
    Given User must be registered
    And  User is on Login Page
    When User enters "<username>" in username field 
     And user enters "<password>" in password field
     And User clicks Login button
    Then User must be navigated to home page
   
 

    Examples: 
      |username||password|
      |Lalitha| |Password123|
         
