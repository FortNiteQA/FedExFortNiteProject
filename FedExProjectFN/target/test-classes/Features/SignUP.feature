
Feature: FedEx signup Page test
@Sanity
Scenario: As a user, customer should be able to fillup FedEx signup Page
	Given Customer launch in Home Page of the FedEx Website
	When Customer click on Sign Up
	And  click on Create Account
	And  Click on Open Account
	And  enter First Name and Last Name 
	And  enter E-mail Name and Re- enter e-mail 
	And enter Address and City
	And  enter State
	And  enter ZIP and Phone Number
	And  enter Address and City
	And  enter Valid User ID, Password and Re-enter Password
	And Customer select a secret question and enter  answer
	And Customer accept terms and conditions
	And Customer clik on continue button
	Then User can see the accont information page
