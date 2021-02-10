Feature: Admin Login page

  Background:
    Given I Launch the admin page

  Scenario: User login with right email and wrong password

    When I enter correct email
    And I enter incorrect password
    Then I cannot login successfully

  Scenario: User login with wrong email and right password

    When I enter incorrect email
    And I enter correct password
    Then I fail to login
