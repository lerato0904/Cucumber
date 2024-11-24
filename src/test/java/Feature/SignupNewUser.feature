Feature: Signup new user

  Scenario: Signup new user
    Given Automation exercise webpage is launched
    When User clicks on the SignupLogin link
    And User enters a username
    And User enters an email address
    And User clicks on the signup button
    Then Confirm user has successfully signed up