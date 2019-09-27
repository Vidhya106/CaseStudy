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
Feature: SignUp 
  

  @tag1
  Scenario: Registration of User
    Given User is on the SignUp page
    When User enters "UserName" in User Name Field
    And User enters "FirstName" as First Name
    And User enters "LastName" as Last Name
    And User enters "password" in password field
    And User re-enters "password" in Confirm Password
    And User selects Female in Gender Field
    And User enters "email" in E- Mail field
    And User enters "MobileNum" in Mobile Number field
    And User selects dob from calendar
    And User selects the security Question
    And User enters "answer" in Answer field
    And User clicks on Register button
    Then User must be navigated to login page
    

  