package com.ispeakbetter.base;

import com.ispeakbetter.pages.LoginPage;
import com.ispeakbetter.pages.SignUpPage;

public class PageManager {

    public static LoginPage loginPage;
   /* public static StudentPage studentPage;
    public static AboutPage aboutPage;
    public static CoursePage coursePage;
    */public static HomePage homepage;
    public static SignUpPage signUpPage;

    public static void initialize() {

        signUpPage = new SignUpPage();
        homepage = new HomePage();
        loginPage = new LoginPage();
        //studentPage = new StudentPage();
        //aboutPage = new AboutPage();
 //       coursePage = new CoursePage();

    }
}