package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement login;

    @CacheLookup
    @FindBy(css = "#userSelect")
    WebElement selectCustomer;

    public void selectCustomer(String text) {

        selectByVisibleTextFromDropDown(selectCustomer, text);
        log.info("Select customer from dropdown " + selectCustomer.toString());
    }
    public void clickOnLogin(){

        clickOnElement(login);
        log.info("Click on login button " + login.toString());
    }
}
