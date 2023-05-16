package com.xyz.bank.steps;

import com.xyz.bank.pages.AccountPage;
import com.xyz.bank.pages.CustomerLoginPage;
import com.xyz.bank.pages.CustomerPage;
import com.xyz.bank.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddandWithdrawSteps {
    @When("^User clicks on customer login button on homepage$")
    public void userClicksOnCustomerLoginButtonOnHomepage() {
        new HomePage().clickOnCustomerLogin();
    }

    @And("^User selects customer from list$")
    public void userSelectsCustomerFromList() {
        new CustomerPage().selectCustomer("Ron Weasly");
    }

    @And("^User clicks on login button on page$")
    public void userClicksOnLoginButtonOnPage() {
        new CustomerPage().clickOnLogin();
    }

    @And("^User clicks on Deposit tab$")
    public void userClicksOnDepositTab() {
        new AccountPage().clickOnDeposit();
    }

    @Then("^User adds money to account$")
    public void userAddsMoneyToAccount() {
        new AccountPage().sendAmount("100");
    }

    @And("^User clicks on submit button on account page$")
    public void userClicksOnSubmitButtonOnAccountPage() {
        new AccountPage().submitButton();
    }

    @Then("^User verifes text Deposit Successful$")
    public void userVerifesTextDepositSuccessful() {
        Assert.assertEquals(new CustomerLoginPage().getMessage3(), "Deposit Successful");
    }

    @And("^User clicks on Withdrawl button$")
    public void userClicksOnWithdrawlButton() {
        new AccountPage().clickOnWithdrawl();
    }

    @Then("^User enters amount to withdraw$")
    public void userEntersAmountToWithdraw() {
        new AccountPage().sendAmount("10");
    }

    @And("^User clicks on submit button to withdraw button$")
    public void userClicksOnSubmitButtonToWithdrawButton() {
        new AccountPage().submitButton();
    }

    @Then("^User verifies text Transaction Successful$")
    public void userVerifiesTextTransactionSuccessful() {
        Assert.assertEquals(new AccountPage().getMessage2(), "Deposit Successful");
    }

    @And("^User logs out of account by clicking logout button$")
    public void userLogsOutOfAccountByClickingLogoutButton() {
        new CustomerLoginPage().clickOnOut();

    }
}
