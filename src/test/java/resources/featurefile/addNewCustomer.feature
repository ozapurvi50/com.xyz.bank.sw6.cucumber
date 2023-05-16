@sanity @regression
Feature: XYZ Bank

  Scenario: Bank ManagerShould Add Customer Succesfully
    Given User is on Homepage
    When  User clicks on Manager Login Button
    And   User clicks on Add customer tab
    And   User adds Firstname to name field
    And   User adds Lastname to lastname field
    And   User enters postcode
    Then  User clicks on Add to Customer button
    And   User switches to Alert tab
    And   User gets text from Alert
    Then  User verifies text from Alert
    And   User accepts the Alert
