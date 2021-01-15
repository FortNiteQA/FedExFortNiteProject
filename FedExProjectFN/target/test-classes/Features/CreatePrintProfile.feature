
Feature: Verify create a print profile 
@Sanity
Scenario: As a user , customer should be able to verify profile after create a print profile 
	Given user navigate the url
	When click on print and design menu , select custom design template
	And click on sign up or log in , click on create a print profile link  
	And enter first name , last name , email , phone number , user id ,password , confirm password ,check on terms of use 
	And click on submit button 


