package com.ispeakbetter.base;

import com.ispeakbetter.pages.AboutPage;
import com.ispeakbetter.pages.CoursePage;
import com.ispeakbetter.pages.LoginPage;
import com.ispeakbetter.pages.StudentPage;

public class PageManager {
    public static LoginPage loginPage;
    public static StudentPage studentPage;
    public static AboutPage aboutPage;
    public static CoursePage coursePage;



    public static void initialize(){
        loginPage = new LoginPage();
        studentPage = new StudentPage();
        aboutPage=new AboutPage();
        coursePage = new CoursePage();

    }

}
