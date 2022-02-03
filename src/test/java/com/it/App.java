package com.it;

import helpers.*;

public class App {
    public LoginHelper login;
    public CommonHelper common;
    public DashboardHelper dashboard;
    public MessageHelpers message;
    public HappyH happy;
    public EmailHelper email;


    public App() {
        login = new LoginHelper();
        common = new CommonHelper();
        dashboard = new DashboardHelper();
        message = new MessageHelpers();
        happy = new HappyH();
        email = new EmailHelper();


    }

    public void close() {
        common.closeApp();
    }
}
