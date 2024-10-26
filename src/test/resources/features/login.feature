Feature: User Login

  Background:
  @smoke
  Scenario: User is able to login with valid credentials

    Given User enters a valid username in the username field
    And User enters valid password in password field
    When User click on the login button
    Then User is logged in successfully

    @regression
    Scenario: User is not able to login with invalid credentials

      Given User enters a invalid username in the username field
      And User enters invalid password in password field
      When User click on the login button
      Then Error message is displayed

