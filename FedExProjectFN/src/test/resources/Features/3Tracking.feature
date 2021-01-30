
Feature: Tracking progress of shipment
@Sprint1
Scenario Outline: As a user, customer should be able to Track a Shipment
Given user navigate the homepage
When click on print and tracking menu
And enter the tracking number as "<Tracking ID>"
And click on tracking button
Then It shows tracking details

Examples:
| Tracking ID |
| 782184933994 |
| 782929300150 |


