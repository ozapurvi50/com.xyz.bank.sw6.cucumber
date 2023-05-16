package com.xyz.bank.steps;

import com.xyz.bank.pages.AddCustomerPage;
import com.xyz.bank.pages.BankManagerLoginPage;
import com.xyz.bank.pages.HomePage;
import com.xyz.bank.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {

    }

    @When("^User clicks on Manager Login Button$")
    public void userClicksOnManagerLoginButton() {
        new HomePage().clickOnManagerLogin();
    }

    @And("^User clicks on Add customer tab$")
    public void userClicksOnAddCustomerTab() {
        new BankManagerLoginPage().clickAddCustomer();
    }

    @And("^User adds Firstname to name field$")
    public void userAddsFirstnameToNameField() {
        new AddCustomerPage().sendNameToElement("Prie");
    }

    @And("^User adds Lastname to lastname field$")
    public void userAddsLastnameToLastnameField() {
        new AddCustomerPage().sendLastNameToElement("Test");
    }

    @And("^User enters postcode$")
    public void userEntersPostcode() {
        new AddCustomerPage().sendPostCodeToElement("DA12 4EP");
    }

    @Then("^User clicks on Add to Customer button$")
    public void userClicksOnAddToCustomerButton() {
        new AddCustomerPage().clickAddCustomer();
    }

    @And("^User switches to Alert tab$")
    public void userSwitchesToAlertTab() {
        new Utility().switchToAlert();
    }

    @And("^User gets text from Alert$")
    public void userGetsTextFromAlert() {
        new Utility().getTextFromAlert();
    }

    @Then("^User verifies text from Alert$")
    public void userVerifiesTextFromAlert() {
        Assert.assertEquals(new Utility().getTextFromAlert(), "Customer added successfully with customer id :6");
    }

    @And("^User accepts the Alert$")
    public void userAcceptsTheAlert() {
        new Utility().acceptAlert();
    }
}
