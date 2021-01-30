  
Feature: Verify Search icon
@Sprint1
Scenario: As a user, customer should be able to Search tracking number in search icon
  Given user navigate the url
  When I click on search icon 
  And Input tracking number
  And press enter
  Then displayed error msg 
