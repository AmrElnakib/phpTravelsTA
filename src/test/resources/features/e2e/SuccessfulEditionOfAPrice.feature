Feature: Admin to Front Page integration

  Scenario: Editing price of a room in Admin and verifying the edition in front page

    Given I load the Admin page
    Then I type correct Admin email
    And I type correct Admin password and click on Login button
    Then I click on sidebar menu Hotels option
    Then I click on Rooms from the Hotels option in the side bar menu
    Then I click on Triple Rooms type in Rendezvous Hotels hotel
    Then I edit the price and click on Submit button
    Then I navigate to the Front page
    Then I type correct Front Page email
    And I type correct Front Page password and click on Login button
    Then I click on Home link
    Then I click on a Rendezvous Hotels from the Feature Hotels section
    Then I assert the price for triple rooms
    Then I close the browser




