Feature: FedEx Shipping page validation
@Sanity
Scenario: As a user, customer should be able to land on Create FedEx shipment page
Given User lands on FedEx homepage
When clicks Return A Package
And clicks on creating a shipping level
Then new window will be open for shipment