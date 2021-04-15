package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.ispeakbetter.base.BasePage.driver;
public class LoginPage {

    @FindBy(xpath = "//a[normalize-space()='Login']")
    public static WebElement loginLink;

    @FindBy(id = "_email")
    public static WebElement username;

    @FindBy(id = "_password")
    public static WebElement password;

    @FindBy(id = "cmdSignin")
    public static WebElement loginBtn;


    public LoginPage() {


        PageFactory.initElements(driver, this);
    }


    public static void clickLoginLink(){
        HelperMethods.doClick(loginLink);
    }


    public static void enterUserName(String user) {
        HelperMethods.sendText(username, user);
    }

    public static void enterPassword(String pass) {
        HelperMethods.sendText(password, pass);
    }

    public static void clickLoginBtn() {
        HelperMethods.doClick(loginBtn);
    }


}