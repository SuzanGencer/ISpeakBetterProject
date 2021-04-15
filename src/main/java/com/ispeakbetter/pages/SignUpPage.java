package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.ispeakbetter.base.BasePage.driver;

public class SignUpPage {

    @FindBy(xpath = "//a[normalize-space()='Signup']")
    public static WebElement signUpLink;

    @FindBy(xpath = "//a[@href='/redirect-google'][normalize-space()='Google+']")
    public static WebElement googleText;

    @FindBy (xpath = "//a[@href='/redirect'][normalize-space()='Facebook']")
    public static WebElement facebookText;

    @FindBy(xpath = "//b[normalize-space()='Sign up']")
    public static WebElement signupButton;

    @FindBy(xpath = "//button[@data-izimodal-transitionout='bounceOutDown']")
    public static WebElement cancelButton;



    public SignUpPage(){
        PageFactory.initElements(driver, this);

    }
    public static void clickOnSignUpLink() {
        HelperMethods.doClick(signUpLink);
    }
    public static void clickOnSignUpBtn2() {
        HelperMethods.doClick(signUpLink);

    }
    public static void clickOnGoogleText(){
        HelperMethods.doClick(googleText);
    }

    public static void clickOnFaceBookText(){
        HelperMethods.doClick(facebookText);
    }
    public static void getTheFacebookURl(){
        HelperMethods.getCurrentURL();
    }

    public static void getTheGoogleURL(){
        HelperMethods.getCurrentURL();
    }

    public static void clickOnCancelButton(){
        HelperMethods.doClick(cancelButton);
    }

    public static void cancelButtonDisabled(){
        HelperMethods.doIsDisplayed(cancelButton);
    }


}