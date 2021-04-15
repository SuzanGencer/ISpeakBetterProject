package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.ConfigReader;
import com.ispeakbetter.pages.LoginPage;
import com.ispeakbetter.pages.StudentPage;
import com.ispeakbetter.utils.HelperMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ispeakbetter.base.BasePage.driver;

public class StudentSD {
    @Given("I am on the student page")
    public void IAmOnTheStudentPage() {
        LoginPage.loginBtn(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
    }

    @When("click dictionary button")
    public void clickDictionaryButton() {
        StudentPage.dictionaryBtnClick();
    }

    @Then("see the dictionary pop-up")
    public void seeTheDictionaryPopUp() {
        String actualTitle= StudentPage.theDictionaryPopUp();
        String expectedTitle="Enter the word";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @And("click help button")
    public void clickHelpButton() throws InterruptedException {
        Thread.sleep(5000);
        StudentPage.helpBtnClick();
    }

    @Then("see the help page")
    public void seeTheHelpPage() {
        String actualTitle= StudentPage.helpPopUp();
        String expectedTitle="ISpeakBetter Introduction";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @And("click vocabulary button")
    public void clickVocabularyButton() {
        StudentPage.vocabularyBtnClick();
    }

    @Then("see the vocabulary page")
    public void seeTheVocabularyPage() {
        StudentPage.vocabularyPage();
    }

    @When("click purchase package button")
    public void clickPurchasePackageButton() {
        StudentPage.purchaseBtnClick();
    }

    @Then("see the purchase package pop-up")
    public void seeThePurchasePackagePopUp() {
        String actualTitle= StudentPage.purchasePopUp();
        String expectedTitle="ISpeakBetter";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("click close button")
    public void clickCloseButton() {
        StudentPage.close();
    }

    @Then("see the student page")
    public void seeTheStudentPage() {
        StudentPage.seeStudentPage();
    }

    @When("click signout button")
    public void clickSignoutButton() {
        StudentPage.signOut();
    }

    @Then("see the home page")
    public void seeTheHomePage() {
         StudentPage.homePage();
    }

    @When("click launchPad button")
    public void clickLaunchPadButton() {
        StudentPage.launchPadClick();
    }
}
