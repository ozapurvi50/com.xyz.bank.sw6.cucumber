package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='First Name']")
    WebElement name;

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='Last Name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='Post Code']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath ="//button[@type='submit']")
    WebElement addCustomerButton;


    public void sendNameToElement(String text) {
        sendTextToElement(name, text);
        log.info("Send text to name field: " + name.toString());

    }

    public void sendLastNameToElement(String text) {
        sendTextToElement(lastName,text);
        log.info("Send text to Lastname field: " + lastName.toString());

    }
    public void sendPostCodeToElement(String text)
    {
        sendTextToElement(postcode, text);
        log.info("Send text to Postcode field: " + postcode.toString());
    }

    public void clickAddCustomer(){
        clickOnElement(addCustomerButton);
        log.info("Click on add Customer Button " + addCustomerButton.toString());
    }

}
