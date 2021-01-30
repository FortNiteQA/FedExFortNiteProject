Feature: Verify navigate back and forth among pages
@Sprint1
Scenario: As a user , customer should be able to go back from about page to hame page
 Given Customer launch in  Home Page of the FedEx
 When scroll end of the page and click on aboutFedex link
 And click on see full story button and go back 
 Then user should be see home page 