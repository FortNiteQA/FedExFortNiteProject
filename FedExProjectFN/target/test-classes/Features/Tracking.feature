
Feature: Tracking progress of shipment
@Sanity
Scenario: As a user, customer should be able to Track a Shipment
	Given user navigate the homepage
	When click on print and tracking menu 
	And Input the tracking number
	And click on tracking button