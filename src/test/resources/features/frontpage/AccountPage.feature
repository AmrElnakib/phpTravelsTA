Feature: Account Page

  Background:

    Given I am on the Account Page

  Scenario: Verify that the Account name matches

    When I click on the My profile
    Then I Assert that the First name is correct
    And I assert that the Last name is correct
