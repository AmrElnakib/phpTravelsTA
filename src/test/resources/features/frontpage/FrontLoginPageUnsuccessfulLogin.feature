Feature: Front Page Login page

  Background:
    Given I Launch the front page

  Scenario: User login with right email and wrong password

    When I enter correct front page email
    And I enter incorrect front page password
    Then I cannot login successfully in the front page

  Scenario: User login with wrong email and right password

    When I enter incorrect front page email
    And I enter correct front page password
    Then I fail to login in the front page
