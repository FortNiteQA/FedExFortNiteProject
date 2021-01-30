Feature: verify Cupon pdf feature  
@Sprint1
Scenario: As a user , customer should be able to see cupon pdf file
	Given user navigate the url of fedex
	When click on print and design menu , select get cupon and deals
	And click on get cupon button
	Then Pdf file in new window should open
