package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());
    @CacheLookup
    @FindBy (xpath="//button[normalize-space()='Deposit']")
    WebElement deposit;


    @CacheLookup
    @FindBy (xpath="//button[@type='submit']")
    WebElement submit;

    @CacheLookup
    @FindBy (xpath="//input[@placeholder='amount']")
    WebElement amount;

    @CacheLookup
    @FindBy (xpath="//button[normalize-space()='Withdrawl']")
    WebElement withdrawl;

    @CacheLookup
    @FindBy (xpath="//span[@class='error ng-binding']")
    WebElement message;

    public void clickOnDeposit(){
        clickOnElement(deposit);
        log.info("Click on Deposit " + deposit.toString());
    }

    public void sendAmount(String text){
        sendTextToElement(amount, text);
    }

    public void submitButton(){
        clickOnElement(submit);
        log.info("Click on submit button" + submit.toString());
    }

    public void clickOnWithdrawl(){

        clickOnElement(withdrawl);
        log.info("Click on withdrawl button" + withdrawl.toString());
    }

    public String getMessage2(){
        log.info("Verify the text message on webpage");
        return getTextFromElement(message);
    }
}
