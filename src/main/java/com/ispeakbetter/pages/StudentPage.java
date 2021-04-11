package com.ispeakbetter.pages;

import com.ispeakbetter.base.PageManager;
import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.ispeakbetter.base.BasePage.driver;

public class StudentPage {

    @FindBy(xpath = "//i[@class=\"fa fa-book\"]")
    public static WebElement dictionaryBtn;

    @FindBy(xpath = "//*[@id=\"launch-pad\"]/a")
    public static WebElement launchPad;

    @FindBy(xpath = "//a[contains(@href,'help_tour')]")
    public static WebElement helpBtn;

    @FindBy(xpath = "//center//a[@class='btn btn2 small turkuaz']")
    public static WebElement vocabularyBtn;

    @FindBy(xpath = "//i[@class=\"fa fa-shopping-cart\"]")
    public static WebElement purchaseBtn;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/form/div[2]/a")
    public static WebElement exportBtn;

    @FindBy(id = "getword")
    public static WebElement purchPopup;

    @FindBy(xpath = "//*[@id=\"modal_renew_subscription\"]/div/div/div[1]/div[2]/button")
    public static WebElement closeBtn;

    @FindBy(xpath = "//img[@class=\"seconds\"]")
    public static WebElement clock;

    @FindBy(xpath = "//a[contains(@href,'signout')]")
    public static WebElement signoutBtn;

    @FindBy(id = "dashboard_goodday")
    public static WebElement dashBoard;

    @FindBy(id = "dialogbox-topbar")
    public static WebElement dialogBox;

    @FindBy(id = "getword")
    public static WebElement dictBox;

    @FindBy(id = "iframerenewsubscription")
    public static WebElement iFrame;

    @FindBy(id = "btnFree")
    public static WebElement freeBtn;


    public StudentPage() {
        PageFactory.initElements(driver, this);
    }

    public static void dictionaryBtnClick() {
        HelperMethods.doClick(dictionaryBtn);
    }

    public static void launchPadClick() {
        HelperMethods.doClick(launchPad);
    }

    public static void helpBtnClick() {
        HelperMethods.doClick(helpBtn);
    }

    public static void vocabularyBtnClick() {
        HelperMethods.doClick(vocabularyBtn);
    }

    public static void purchaseBtnClick() {
        HelperMethods.doClick(purchaseBtn);
    }

    public static String theDictionaryPopUp() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return dictBox.getAttribute("placeholder");

    }

    public static String helpPopUp() {

        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> windowHandleList = new ArrayList<String>(windowHandles);
        driver.switchTo().window(windowHandleList.get(1));
        return HelperMethods.doGetPageTitle();
    }

    public static void vocabularyPage() {
        HelperMethods.doIsDisplayed(exportBtn);
    }

    public static String purchasePopUp() {
        PageManager.initialize();
        driver.switchTo().frame(iFrame);
        return driver.findElement(By.tagName("title")).getAttribute("innerHTML");
    }

    public static void close() {
        HelperMethods.doClick(closeBtn);
    }

    public static void seeStudentPage() {
        HelperMethods.doIsDisplayed(clock);
    }

    public static void signOut() {
        HelperMethods.doClick(signoutBtn);
    }

    public static void homePage() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(freeBtn));
    }

}
