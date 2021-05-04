package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.pages.AboutPage;
import com.ispeakbetter.pages.LoginPage;
import com.ispeakbetter.utils.HelperMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AboutSD {

    @Given("I am on the Home page")
    public void verifyHomePage() {
        String expectedTitle= "Learn English with Online Teachers - Get your Free Live English Class Now.";
        Assert.assertEquals(HelperMethods.doGetPageTitle(),expectedTitle);
    }

    @When("I click on About button")
    public void iClickOnAboutButton() {
        AboutPage.clickAboutBtn();
    }

    @Then("I see the About page")
    public void iSeeTheAboutPage() {
        String expectedURL = "https://ispeakbetter.com/about";
        Assert.assertEquals(expectedURL,AboutPage.verifyURL());
    }

    @Given("I am on the about pages")
    public void iAmOnTheAboutPages() {
        AboutPage.clickAboutBtn();
        String expectedURL = "https://ispeakbetter.com/about";
        Assert.assertEquals(expectedURL,AboutPage.verifyURL());
    }

    @When("I click on the button I Speak better interactive learning System")
    public void iClickOnTheButtonISpeakBetterInteractiveLearningSystem() {

        AboutPage.clickLearningSystemLink();
    }


    @Then("YouTube video opened")
    public void youtubeVideoOpened() {

       String expectedURL = "https://www.youtube.com/watch?v=DnlaXucYWKw&t=8s";
    //   Assert.assertEquals(expectedURL,AboutPage.openYouTube());


    }
}
