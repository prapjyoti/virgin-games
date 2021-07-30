package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


//LoginPage extends to utility for the methods that needs to be performed
public class LoginPage extends Utility {

    /*
     * Private static Logger for logging the elements and methods into the log4j
     * log.info will record the info into log4j and logs
     * Using selenium by by methods for locators/elements
     * Creating methods applicable to various locators
     */

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //Listing all the elements through their locators

    By emailField = By.xpath("//input[@id='field-username']");
    By passwordField = By.xpath("//input[@id='field-password']");
    By loginButton = By.xpath("//button[@type='submit']");
    By errorMessageWithInvalidCredential = By.xpath("//div[contains(text(),'Please try again, your username/email or password ')]");
    By errorMessageForBothFieldEmpty = By.xpath("//div[contains(text(),'Both your username and password are required')]");

   //This method enter email in email field
    public void enterEmailIdInEmailField(String email) {
        clickOnElement(emailField);
        sendTextToElement(emailField, email);
        log.info("Entering invalid email address:" + email + "to email field" + emailField.toString() + "<br>");

    }
   //This method enter password in password field
    public void enterPasswordInPasswordField(String password) {
        clickOnElement(passwordField);
        sendTextToElement(passwordField, password);
        log.info("Entering invalid password:" + password + "to password field" + passwordField.toString() + "<br>");

    }
    //This method click on login button as type is submit so submit method is used
    public void clickOnLoginButton(){
        log.info("Click on Welcome Text : " + loginButton.toString());
        clickOnSubmit(loginButton);

    }
    //This method verify user Navigate to next page with invalid credential

    public String verifyMessageWithInvalidCredentials(){
        log.info("Verify message after passing invalid data : " + errorMessageWithInvalidCredential.toString());
        return getTextFromElement(errorMessageWithInvalidCredential);


    }
    public void verifyErrorMessageIsDisplayed(String message){
        log.info("Verify message is displayed : " + errorMessageWithInvalidCredential.toString());
       verifyThatTextIsDisplayed(errorMessageWithInvalidCredential,message);


    }
    //This method verify user Navigate to next page with both field are empty

    public String verifyMessageForBothFiledEmpty(){
        log.info("Verify message after leave both field empty : " + errorMessageForBothFieldEmpty.toString());
        return getTextFromElement(errorMessageForBothFieldEmpty);
    }
    public void verifyErrorMessageIsDisplayedForEmptyField(String message){
        log.info("Verify message is displayed for emptyField: " + errorMessageForBothFieldEmpty.toString());
        verifyThatTextIsDisplayed(errorMessageForBothFieldEmpty,message);


    }

}

