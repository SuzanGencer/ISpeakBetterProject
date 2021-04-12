package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.BasePage;
import com.ispeakbetter.base.ConfigReader;
import com.ispeakbetter.base.PageManager;
import com.ispeakbetter.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import org.junit.AfterClass;

public class Hooks {

    @Before
    public void start() {
        BasePage.initializeDriver();
        PageManager.initialize();
    }

    @After
    public void end() {
        BasePage.tearDown();
    }
}
