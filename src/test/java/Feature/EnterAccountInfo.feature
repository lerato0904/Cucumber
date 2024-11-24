Feature: Signup new user

  Scenario: Signup new user
    Given Automation exercise webpage is launched
    When User clicks on the SignupLogin link
    And User enters a username
    And User enters an email address
    And User clicks on the signup button
    And Enter password
    And Enter FirstName
    And Enter LastName
    And Enter Company name
    And Enter Address
    And Select 'New Zealand' as a Country
    And Enter 'South Island' as a State
    And Enter 'Island' as a City
    And Enter Zipcode
    And Enter Mobile number
    And Click on the Create Account button
