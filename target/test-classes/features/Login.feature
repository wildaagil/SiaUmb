Feature: Login
  As a user
  I want to login
  So i can success login

  Scenario: login success
    Given I on the login page
    When I input username
    And I input password
    And I click login button
    And I click exit in popup
    Then I will go to dashboard