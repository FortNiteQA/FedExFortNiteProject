
Feature: Verify Login page
@Sanity
Scenario: As a user , Customer should be able to Login successfully
	Given Customer land on Fedex Homepage
	When customer clicks on Signup or login
	And customer put UserId "Ruhi123"
	And Customer put Password "Crazy1234"
	Then Customer able to Login Successfully