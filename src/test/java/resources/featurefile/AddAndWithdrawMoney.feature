@smoke
Feature: Add and Withdraw Money

Scenario: Customer should add and withdraw money

  Given User is on homepage
  When User clicks on customer login button on homepage
  And User selects customer from list
  And User clicks on login button on page
  And User clicks on Deposit tab
  Then User adds money to account
  And User clicks on submit button on account page
  Then User verifes text Deposit Successful
  And User clicks on Withdrawl button
  Then User enters amount to withdraw
  And User clicks on submit button to withdraw button
  Then User verifies text Transaction Successful
  And User logs out of account by clicking logout button
