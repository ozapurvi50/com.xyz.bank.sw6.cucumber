package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());


    @CacheLookup
    @FindBy(xpath ="//span[@class='fontBig ng-binding']")
    WebElement getMessageObj;

    @CacheLookup
    @FindBy(xpath ="//button[@class='btn logout']")
    WebElement clickOnOutObj;

    @CacheLookup
    @FindBy(xpath ="//label[normalize-space()='Your Name :']")
    WebElement getMessage2Obj;

    @CacheLookup
    @FindBy(xpath ="//span[@class='error ng-binding']")
    WebElement  messageDeposit;



    public String getMessage(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(getMessageObj);
    }

    public String getMessage1(){

        log.info("Verify Text from Webpage");
        return getTextFromElement( clickOnOutObj);
    }

    public void clickOnOut(){
        clickOnElement( clickOnOutObj);
        log.info("Click on Login Button " + clickOnOutObj.toString());
    }

    public String getMessage2(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(getMessage2Obj);
    }

    public String getMessage3(){
        log.info("Verify Text from Webpage");
        return getTextFromElement(messageDeposit);
    }
}
