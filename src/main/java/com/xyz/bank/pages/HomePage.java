package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Bank Manager Login']")
    WebElement managerLogin;

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Customer Login']")
    WebElement customerLogin;

    public void clickOnManagerLogin() {
        clickOnElement(managerLogin);
        log.info("Click on Login Button " +managerLogin.toString());
    }

    public void clickOnCustomerLogin() {

        clickOnElement(customerLogin);
        log.info("Click on Login Button " + customerLogin.toString());
    }
}
