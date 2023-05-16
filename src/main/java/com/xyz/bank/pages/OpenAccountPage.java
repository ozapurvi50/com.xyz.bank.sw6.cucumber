package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @CacheLookup
    @FindBy( css="#userSelect" )
    WebElement selectCustomer;

    @CacheLookup
    @FindBy( css="#currency" )
    WebElement currency;

    @CacheLookup
    @FindBy(xpath ="//button[@type='submit']")
    WebElement  process;


    public void selectCustomer(String text) {

        selectByVisibleTextFromDropDown(selectCustomer, text);
        log.info("Select customer from dropdown " + selectCustomer.toString());
    }

    public void selectCurrency(String text) {
        selectByVisibleTextFromDropDown(currency, text);
        log.info("Select currency from dropdown " + currency.toString());
    }

    public void clickProcess() {
        clickOnElement(process);
        log.info("Click on process button " + process.toString());
    }
}
