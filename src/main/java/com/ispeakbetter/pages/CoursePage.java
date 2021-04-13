package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.ispeakbetter.base.BasePage.driver;

public class CoursePage {

    @FindBy(xpath = "//*[@id='mobile-navbar-collapse']/ul/li[4]/a/span")
    public static WebElement courseBtn;

    @FindBy(xpath = "//*[@id='course-section']/div/div[2]/div/div[2]/div/div[2]/div[2]/h4/a")
    public static WebElement enrollBtn;

    @FindBy(xpath = "//*[@id='course-section']/div/div[2]/div/div[3]/div/div[2]/div[2]/h4/a")
    public static WebElement enrollChildrenEnglish;

    @FindBy(xpath = "//*[@id='cmdSignupLink']")
    public static WebElement getFreeClassBtn;

    @FindBy(id = "signup")
    public static WebElement signUp;

    public CoursePage(){
        PageFactory.initElements(driver,this);
    }

    public static void clickCourseBtn(){
        HelperMethods.doClick(courseBtn);
    }

    public static String verifyURL(){
        return HelperMethods.getCurrentURL();
    }

    public static void enrollBusinessEnglish(){
        HelperMethods.doClick(enrollBtn);
    }

    public static void enrollChildrenEnglish(){
        HelperMethods.doClick(enrollChildrenEnglish);
    }

    public static void getFreeClass(){
        HelperMethods.doClick(getFreeClassBtn);
    }

    public static boolean isSignupVisible(){
        return HelperMethods.doIsDisplayed(signUp);
    }



}
