$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OpenNewAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Open New Account",
  "description": "",
  "id": "open-new-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 5705771800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should open new bank account",
  "description": "",
  "id": "open-new-account;user-should-open-new-bank-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Bank Manager Login Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User click On Open Account Tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User searchs customer that added",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User selects currency Pound",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on process button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User switches to Popup Alert displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Verifies message Account created successfully on alert",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Click on ok button on popup and accepts popup",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerLoginSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 69741600,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccountSteps.userClicksOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 220714300,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccountSteps.userClickOnOpenAccountTab()"
});
formatter.result({
  "duration": 224517700,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccountSteps.userSearchsCustomerThatAdded()"
});
formatter.result({
  "duration": 20476594700,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccountSteps.userSelectsCurrencyPound()"
});
formatter.result({
  "duration": 107248500,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccountSteps.userClicksOnProcessButton()"
});
formatter.result({
  "duration": 76880500,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccountSteps.userSwitchesToPopupAlertDisplayed()"
});
formatter.result({
  "duration": 6746200,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccountSteps.userVerifiesMessageAccountCreatedSuccessfullyOnAlert()"
});
formatter.result({
  "duration": 15234400,
  "status": "passed"
});
formatter.match({
  "location": "OpenAccountSteps.userClickOnOkButtonOnPopupAndAcceptsPopup()"
});
formatter.result({
  "duration": 9331100,
  "status": "passed"
});
formatter.after({
  "duration": 712626300,
  "status": "passed"
});
formatter.uri("addNewCustomer.feature");
formatter.feature({
  "line": 2,
  "name": "XYZ Bank",
  "description": "",
  "id": "xyz-bank",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2307968200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Bank ManagerShould Add Customer Succesfully",
  "description": "",
  "id": "xyz-bank;bank-managershould-add-customer-succesfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Manager Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Add customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User adds Firstname to name field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User adds Lastname to lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters postcode",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Add to Customer button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User switches to Alert tab",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User gets text from Alert",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User verifies text from Alert",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User accepts the Alert",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 32000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClicksOnManagerLoginButton()"
});
formatter.result({
  "duration": 208132000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClicksOnAddCustomerTab()"
});
formatter.result({
  "duration": 223951100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userAddsFirstnameToNameField()"
});
formatter.result({
  "duration": 1053668100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userAddsLastnameToLastnameField()"
});
formatter.result({
  "duration": 71198700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userEntersPostcode()"
});
formatter.result({
  "duration": 109663100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClicksOnAddToCustomerButton()"
});
formatter.result({
  "duration": 74989200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userSwitchesToAlertTab()"
});
formatter.result({
  "duration": 5576200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userGetsTextFromAlert()"
});
formatter.result({
  "duration": 9868700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userVerifiesTextFromAlert()"
});
formatter.result({
  "duration": 8204500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userAcceptsTheAlert()"
});
formatter.result({
  "duration": 13757300,
  "status": "passed"
});
formatter.after({
  "duration": 746325400,
  "status": "passed"
});
formatter.uri("customerLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Customer Login Page",
  "description": "",
  "id": "customer-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3324022600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Customer Should Login And Logout Suceessfully",
  "description": "",
  "id": "customer-login-page;customer-should-login-and-logout-suceessfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Clicks on Customer Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Search customer that you created.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Verifies Your Name text displayed.",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User verifies Logout text displayed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Clicks on Logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User verifies Name text displayed",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerLoginSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 13600,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginSteps.userClicksOnCustomerLoginTab()"
});
formatter.result({
  "duration": 382867500,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginSteps.userSearchCustomerThatYouCreated()"
});
formatter.result({
  "duration": 20381972400,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginSteps.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 80995000,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginSteps.userVerifiesYourNameTextDisplayed()"
});
formatter.result({
  "duration": 539929200,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginSteps.userVerifiesLogoutTextDisplayed()"
});
formatter.result({
  "duration": 40366900,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginSteps.userClicksOnLogoutButton()"
});
formatter.result({
  "duration": 44148600,
  "status": "passed"
});
formatter.match({
  "location": "CustomerLoginSteps.userVerifiesNameTextDisplayed()"
});
formatter.result({
  "duration": 20937400,
  "status": "passed"
});
formatter.after({
  "duration": 819111000,
  "status": "passed"
});
});