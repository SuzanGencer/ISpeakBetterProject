package com.ispeakbetter.base;

import com.ispeakbetter.pages.*;

public class PageManager {
    public static LoginPage loginPage;
    public static StudentPage studentPage;
    public static AboutPage aboutPage;
    public static CoursePage coursePage;
    public static ContactPage contactPage;
    public static HomePage homepage;
    public static SignUpPage signUpPage;


    public static void initialize(){
        loginPage = new LoginPage();
        studentPage = new StudentPage();
        aboutPage=new AboutPage();
        coursePage = new CoursePage();
        contactPage = new ContactPage();
        signUpPage = new SignUpPage();
        homepage = new HomePage();
        

    }
}