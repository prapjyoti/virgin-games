package com.virgingames.cucumber.stepdefs;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//defining methods to the various steps in the feature file
//method called from various pages classes in pages package

public class LoginStepdefs {
    @Given("^I am home page$")
    public void iAmHomePage() {

    }

    @And("^I click on login link$")
    public void iClickOnLoginLink() {
       new HomePage().clickOnCookieButton();
        new HomePage().clickOnLoginLink();

    }

    @When("^I enter invalid email\"([^\"]*)\" in email field$")
    public void iEnterInvalidEmailInEmailField(String email)  {
        new LoginPage().enterEmailIdInEmailField(email);

    }

    @And("^I enter invalid password \"([^\"]*)\" in password field$")
    public void iEnterInvalidPasswordInPasswordField(String password)  {
        new LoginPage().enterPasswordInPasswordField(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see error \"([^\"]*)\" for invalid credentials$")
    public void iShouldSeeErrorForInvalidCredentials(String message)  {
        new LoginPage().verifyErrorMessageIsDisplayed(message);
        new LoginPage().verifyErrorMessageIsDisplayedForEmptyField(message);
    }
}
