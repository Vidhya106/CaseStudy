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
Feature: AddToCart
 
 
 Background: 
 Given User Should be logged in
 
  @tag1
  Scenario: Search Successfull
    When User enters the "search" keyword
    And User selects the required product
   Then User must be navigated to Proudct Details Page

  @tag2
  Scenario: Search Unsuccessfull
    
    When User enters keyword
    And User couldn't find the revelant products 
    Then User gets an error message 
   @tag3
   Scenario: Add To Cart
  
   When User search a particular product
   And User try to move forward without adding product
   Then TestMe doesn't display cart icon
