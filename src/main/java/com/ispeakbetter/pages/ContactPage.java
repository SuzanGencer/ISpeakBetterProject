package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.ispeakbetter.base.BasePage.driver;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(driver, this);
    }

    public static String verifyURL(){
        return HelperMethods.getCurrentURL();
    }

    @FindBy(xpath = "//*[@id='mobile-navbar-collapse']/ul/li[5]")
    public static WebElement clickCP;

    public static void clickContactPage(){HelperMethods.doClick(clickCP);}

    public static String verifyTitle(){
        return HelperMethods.doGetPageTitle();
    }

    @FindBy(name = "name")
    public static WebElement inName;

    @FindBy(name = "email")
    public static WebElement inEmail;

    @FindBy(name = "subject")
    public static WebElement subject;

    @FindBy(name = "message")
    public static WebElement inMessage;

    @FindBy(xpath = "//*[@id='contact-section']/div/div[3]/div/form/fieldset/div[3]/input")
    public static WebElement cLickConUsBtn;

    public static void inputName(String input){
        HelperMethods.sendText(inName, input);
    }
    public static void inputEmail(String input){
        HelperMethods.sendText(inEmail, input);
    }
    public static void selectSubject(){
        WebElement element = subject;

    }
    public static void inputMessage(String input){
        HelperMethods.sendText(inMessage, input);
    }

    public static void scrollDown(){
        HelperMethods.specificScrollPageDown();
    }
}