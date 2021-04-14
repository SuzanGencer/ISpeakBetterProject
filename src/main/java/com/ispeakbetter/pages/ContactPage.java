package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

import static com.ispeakbetter.base.BasePage.driver;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='mobile-navbar-collapse']/ul/li[5]/a/span")
    public static WebElement clickCP;

    public static void clickContactPage(){HelperMethods.doClick(clickCP);}

    public static String verifyURL(){
        return HelperMethods.getCurrentURL();
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
    public static WebElement contactUsBtn;

    public static void inputName(String input){
        HelperMethods.sendText(inName, input);
    }
    public static void inputEmail(String input){
        HelperMethods.sendText(inEmail, input);
    }
    public static void selectSubj(){
        HelperMethods.dropDownMenu(subject);

    }
    public static void inputMessage(String input){
        HelperMethods.sendText(inMessage, input);
    }

    public static void clickContactUsBtn(){
        HelperMethods.doClick(contactUsBtn);
    }

    public static void scrollDown(){
        HelperMethods.specific2ScrollPageDown();
    }

    @FindBy(xpath = "//*[@id='go-top']/a/span")
    public static WebElement clickScrollUp;

    public static void scrollUp(){
        HelperMethods.doClick(clickScrollUp);
    }

    @FindBy(id = "zsiq_agtpic")
    public static WebElement chatBtn;

    @FindBy(tagName = "frame")
    public static List<WebElement> frame;

    @FindBy(id = "siqiframe")
    public static WebElement frameIndex;

    @FindBy(id = "visname")
    public static WebElement chatName;

    @FindBy(id = "visemail")
    public static WebElement chatEmail;

    @FindBy(id = "msgarea")
    public static WebElement chatMessage;

    @FindBy(id = "sqico-send")
    public static WebElement startChatBtn;

    public static void clickChatBtn(){
        HelperMethods.doClick(chatBtn);
    }

    public static void framePart(){
        HelperMethods.frame(frame, frameIndex);
    }

    public static void inputChatName(String input){
        HelperMethods.sendText(chatName, input);
    }

    public static void inputChatEmail(String input){
        HelperMethods.sendText(chatEmail, input);
    }

    public static void inputChatMessage(String input){
        HelperMethods.sendText(chatMessage, input);
    }

    public static void clickStartChat(){
        HelperMethods.doClick(startChatBtn);
    }

    @FindBy(id = "dropdownMenuLink")
    public static WebElement languageMenu;

    @FindBy(id = "langTr")
    public static WebElement selectLanguage;

    public static void clickLanguageMenu(){
        HelperMethods.doClick(languageMenu);
    }

    public static void clickSelectLanguage(){
        HelperMethods.doClick(selectLanguage);
    }

}