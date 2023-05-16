package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Add Customer']")
    WebElement clickAddCustomer;

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Open Account']")
    WebElement openAccount;


    public void clickAddCustomer(){
        clickOnElement(clickAddCustomer);
        log.info("Click on Add customer Button " + clickAddCustomer.toString());
    }

    public void clickOpenAccount(){

        clickOnElement(openAccount);
        log.info("Click on Open Account Button " + openAccount.toString());
    }
}
