package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    // Homepage class store the elements locators for home page
    //HomePage extends to utility for the methods that needs to be performed

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By loginLink = By.xpath("//a[normalize-space()='Login']");

    By cookie = By.xpath("//button[contains(text(),'OK')]");

    public void clickOnLoginLink() {
        log.info("Mouse Hoover and Clicking on loginLink : " + loginLink.toString());
        mouseHoverToElementAndClick(loginLink);
    }

    public void clickOnCookieButton() {
        log.info("Click on cookie : " + cookie.toString());
        clickOnElement(cookie);

    }
}
