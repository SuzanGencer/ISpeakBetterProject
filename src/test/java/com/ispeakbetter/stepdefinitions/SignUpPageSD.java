package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPageSD {

    @Given("I am on the sign up page")
    public void i_am_on_the_sign_up_page() {
        SignUpPage.clickOnSignUpLink();
    }
    @When("I click on facebook text")
    public void i_click_on_facebook_text() {
        SignUpPage.clickOnFaceBookText();
    }
    @Then("I get the URL")
    public void i_get_the_url() {
        SignUpPage.getTheFacebookURl();
    }

    @Given("I am on the sign up page2")
    public void i_am_on_the_sign_up_page2() throws InterruptedException {
        SignUpPage.clickOnSignUpBtn2();
        Thread.sleep(3000);
    }
    @When("I click on google text")
    public void i_click_on_google_text() {
        SignUpPage.clickOnGoogleText();
    }
    @Then("I get the URL2")
    public void i_get_the_URL() {
        SignUpPage.getTheGoogleURL();
    }

    @Given("I am on the sign up page3")
    public void i_am_on_the_sign_up_page3() throws InterruptedException {
        SignUpPage.clickOnSignUpLink();
        Thread.sleep(2000);
    }
    @And("I click on cancel button")
    public void i_clickOn_cancel_button() throws InterruptedException {
        SignUpPage.clickOnCancelButton();
        Thread.sleep(2000);
    }
    @Then("I see the cancel button")
    public void i_see_the_cancel_button() throws InterruptedException {
        SignUpPage.cancelButtonDisabled();
        Thread.sleep(2000);
    }
}
