package com.ispeakbetter.base;

import com.ispeakbetter.pages.LoginPage;
import com.ispeakbetter.pages.StudentPage;

public class PageManager {
    public static LoginPage loginPage;
    public static StudentPage studentPage;


    public static void initialize(){
        loginPage = new LoginPage();
        studentPage = new StudentPage();

    }

}
