package com.xyz.bank.steps;

import com.xyz.bank.browserfactory.ManageBrowser;
import com.xyz.bank.pages.BankManagerLoginPage;
import com.xyz.bank.pages.HomePage;
import com.xyz.bank.pages.OpenAccountPage;
import com.xyz.bank.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class OpenAccountSteps {
    @Then("^User clicks on Bank Manager Login Tab$")
    public void userClicksOnBankManagerLoginTab() {
        new HomePage().clickOnManagerLogin();
    }

    @And("^User click On Open Account Tab$")
    public void userClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOpenAccount();
    }

    @And("^User searchs customer that added$")
    public void userSearchsCustomerThatAdded() {
        new OpenAccountPage().selectCustomer("Ron Weasly ");
    }

    @And("^User selects currency Pound$")
    public void userSelectsCurrencyPound() {
        new OpenAccountPage().selectCurrency("Pound");
    }

    @And("^User clicks on process button$")
    public void userClicksOnProcessButton() {
       new OpenAccountPage().clickProcess();
    }

    @Then("^User switches to Popup Alert displayed$")
    public void userSwitchesToPopupAlertDisplayed() {
       new Utility().switchToAlert();
    }

    @And("^User Verifies message Account created successfully on alert$")
    public void userVerifiesMessageAccountCreatedSuccessfullyOnAlert() {
        new Utility().getTextFromAlert();
        Assert.assertEquals(new Utility().getTextFromAlert(), "Account created successfully with account Number :1016");
    }

    @Then("^User Click on ok button on popup and accepts popup$")
    public void userClickOnOkButtonOnPopupAndAcceptsPopup() {
        new Utility().acceptAlert();
    }
}
