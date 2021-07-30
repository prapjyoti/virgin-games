package com.virgingames.cucumber;

import com.cucumber.listener.Reporter;
import com.virgingames.basepage.BasePage;
import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends BasePage {

//Before and after Annotations used open and close browser

    @Before
    public void openBrowser() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Quality Tester", "Jyoti Prajapati");
    }

    /*
     * Assigning parameter for listener for screenshots and removing the space and replace by _
     * handle exception with try and catch
    */
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace("", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
