package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.ConfigReader;
import com.ispeakbetter.pages.LoginPage;
import io.cucumber.java.en.Given;

public class LoginSD {
    @Given("I am on the login page")
    public void IAmOnTheLoginPage() {
        LoginPage.loginBtn(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
    }


}
