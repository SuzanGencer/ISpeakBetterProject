package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.ispeakbetter.base.BasePage.driver;

public class AboutPage {

    @FindBy(xpath="//*[@id='mobile-navbar-collapse']/ul/li[3]/a/span")
    public static WebElement aboutBtn;

    @FindBy(xpath = "//*[@id='page']/section[2]/div/div/div[2]/p/strong/a")
    public static WebElement learningSystemLink;

    @FindBy(xpath = "//*[@id='container']/h1/yt-formatted-string")
    public static WebElement title;

    public AboutPage() {
        PageFactory.initElements(driver,this);
    }

    public static void clickAboutBtn(){
        HelperMethods.doClick(aboutBtn);
    }

    public static String verifyURL(){
        return HelperMethods.getCurrentURL();
    }

    public static void clickLearningSystemLink(){
        HelperMethods.specificScrollPageDown();
        HelperMethods.waitForClickability(learningSystemLink);
        HelperMethods.doClick(learningSystemLink);
    }

    public static void openYouTube(){
        HelperMethods.windowHandles();

    }
}
