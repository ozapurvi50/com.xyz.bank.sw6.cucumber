@smoke @regression
Feature: Open New Account

  Scenario: User should open new bank account
Given User is on homepage
Then User clicks on Bank Manager Login Tab
And User click On Open Account Tab
And User searchs customer that added
And User selects currency Pound
And User clicks on process button
Then User switches to Popup Alert displayed
And User Verifies message Account created successfully on alert
Then User Click on ok button on popup and accepts popup
