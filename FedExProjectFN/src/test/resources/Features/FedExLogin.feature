Feature: Verify Login page

  @Sanity
  Scenario Outline: As a user , Customer should be able to Login successfully
    Given Customer land on Fedex Homepage
    When customer clicks on Signup or login
    And customer enter as "<userid>"
    And Customer enters "<password>"
    Then Customer able to Login Successfully

    Examples: 
      | userid    | password    |
      | Ruhi123   | Crazy1234   |
      | TalenTech | TalenTech12 |
