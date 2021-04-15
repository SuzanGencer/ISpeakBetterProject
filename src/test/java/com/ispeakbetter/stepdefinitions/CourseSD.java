package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.pages.AboutPage;
import com.ispeakbetter.pages.CoursePage;
import com.ispeakbetter.utils.HelperMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CourseSD {

    @Given("I am on the Home Page")
    public void verifyHomePageURL() {
        String expectedTitle = "Learn English with Online Teachers - Get your Free Live English Class Now.";
        Assert.assertEquals(HelperMethods.doGetPageTitle(), expectedTitle);
    }

    @When("I click on Course button")
    public void iClickOnCourseButton() {
        CoursePage.clickCourseBtn();

    }

    @Then("I see the Course page")
    public void iSeeTheCoursePage() {
        String expectedURL = "https://ispeakbetter.com/courses";
        Assert.assertEquals(expectedURL, CoursePage.verifyURL());
    }

    @Given("^I am on the Course Page$")
    public void iAmOnTheCoursePage() {
        CoursePage.clickCourseBtn();
        String expectedURL = "https://ispeakbetter.com/courses";
        Assert.assertEquals(expectedURL, CoursePage.verifyURL());

    }

    @When("I click on the button Enroll Business English")
    public void iClickOnEnrollBusinessEnglishButton() {
        CoursePage.enrollBusinessEnglish();
    }

    @Then("I see the Business English page")
    public void iSeeTheBusinessEnglishPage() {
        String expectedURL = "https://ispeakbetter.com/business-english";
        Assert.assertEquals(expectedURL, CoursePage.verifyURL());
    }


    @When("I click on the button Enroll Children English")
    public void iClickOnTheButtonEnrollChildrenEnglish() {
        CoursePage.enrollChildrenEnglish();
    }

    @And("I click on the button Get a Free Class")
    public void iClickOnTheButtonGetAFreeClass() {
        CoursePage.getFreeClass();
    }

    @Then("I see sign up page")
    public void iSeeSignUpPage() {
        Assert.assertTrue(CoursePage.isSignupVisible());
    }



}
