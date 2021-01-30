Feature: Verify Language Chnage

  @Sanity
  Scenario: As a user I should be able change Language as I need
    Given customer is in homepage
    When scroll end of the page and click on language
    And select espaniol
    Then displayed spanish language
