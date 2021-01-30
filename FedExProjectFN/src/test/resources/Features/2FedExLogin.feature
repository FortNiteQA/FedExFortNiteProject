
Feature: Verify Login page
@Sprint1
Scenario Outline: As a user , Customer should be able to Login successfully
  Given Customer land on Fedex Homepage
  When customer clicks on Signup or login
  And customer enter as "<userid>"
  And Customer enters "<password>"
  Then Customer able to Login Successfully

   Examples: 
     | userid | password  |
     |Ruhi1234|Crazy123|
     |TalenTech|TalenTech12|