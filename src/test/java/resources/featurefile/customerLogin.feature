@regression
Feature: Customer Login Page

  Scenario: Customer Should Login And Logout Suceessfully
    Given User is on homepage
    When User Clicks on Customer Login Tab
    And User Search customer that you created.
    And  User Clicks on Login Button
    Then User Verifies Your Name text displayed.
    And User verifies Logout text displayed
    Then User Clicks on Logout button
    And User verifies Name text displayed


