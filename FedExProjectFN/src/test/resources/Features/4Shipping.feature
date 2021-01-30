
Feature: FedEx Shipping page validation
@Sprint1
Scenario: As a user, customer should be able to land on Create FedEx shipment page
		Given User lands on FedEx homepage
    When click on return pkg
    And scroll and click on create shipping label
    And Input your name and receipent name
    And click on continue 
    Then shows error msg

