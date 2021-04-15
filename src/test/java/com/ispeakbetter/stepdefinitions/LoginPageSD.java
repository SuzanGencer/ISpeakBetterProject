package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.ConfigReader;
import com.ispeakbetter.pages.LoginPage;
import com.ispeakbetter.utils.HelperMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSD {

    @Given("I am on the login page")
    public void i_am_on_the_log_in_page() throws InterruptedException {
        LoginPage.clickLoginLink();
        Thread.sleep(6000);
    }

    @When("I enter valid username")
    public void iEnterValidUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }


    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        LoginPage.clickLoginBtn();
    }

    @Then("I see the home page")
    public void seeTheHomePage() throws InterruptedException {
        HelperMethods.getCurrentURL();
    }

    @Given("I am on the login page2")
    public void i_am_on_the_log_in_page2() throws InterruptedException {
        LoginPage.clickLoginLink();
        Thread.sleep(6000);
    }

    @When("I enter invalid username")
    public void iEnterInValidUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("invalidusername"));

    }

    @And("I enter invalid password")
    public void iEnterInValidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("invalidpassword"));
    }

    @And("I click on the login button 2")
    public void iClickOnTheLoginButton2() {
        LoginPage.clickLoginBtn();
    }
}