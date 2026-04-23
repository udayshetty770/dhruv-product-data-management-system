package com.dhruv.pdms.main;

import com.dhruv.pdms.service.LoginService;
import com.dhruv.pdms.util.MenuUtil;

public class Application {

    public static void main(String[] args) {

        LoginService loginService = new LoginService();

        boolean loginStatus = loginService.login();

        if (loginStatus) {
            MenuUtil.showMainMenu();
        } else {
            System.out.println("Application Closed.");
        }
    }
}