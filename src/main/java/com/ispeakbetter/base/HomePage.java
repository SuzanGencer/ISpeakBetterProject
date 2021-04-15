package com.ispeakbetter.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.ispeakbetter.base.BasePage.driver;

public class HomePage {

    @FindBy(xpath = "//span[@data-hover='Home']")
    public static WebElement homePage;

    public HomePage(){

        PageFactory.initElements(driver, this);
    }


        }




