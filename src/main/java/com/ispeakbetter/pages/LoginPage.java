package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ispeakbetter.base.BasePage.driver;

public class LoginPage {

    //Fields : Locators,webelements
//LOGIN
    @FindBy(id = "_email")
    public static WebElement emailInput;
    @FindBy(id = "_password")
    public static WebElement passwordInput;
    @FindBy(id = "cmdSiginLink")
    public static WebElement signLink;
    @FindBy(id = "cmdSignin")
    public static WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"launch-pad\"]/a")
    public static WebElement launchPad;
    @FindBy(id = "dashboard_goodday")
    public static WebElement dashBoard;

//SIGNUP




    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    public static String verifyTitle(){
        return HelperMethods.doGetPageTitle();
    }

    public static void loginBtn(String email,String password){

        HelperMethods.doClick(signLink);
        HelperMethods.sendText(emailInput,email);
        HelperMethods.sendText(passwordInput,password);
        HelperMethods.doClick(loginButton);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(dashBoard));
    }

}
