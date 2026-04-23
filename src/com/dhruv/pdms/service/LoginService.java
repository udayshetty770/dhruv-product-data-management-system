package com.dhruv.pdms.service;

import java.util.Scanner;

public class LoginService {

    public boolean login() {

        Scanner scanner = new Scanner(System.in);

        String validUser = "admin";
        String validPass = "admin123";

        int attempts = 3;

        while (attempts > 0) {

            System.out.println("===== LOGIN =====");
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (username.equals(validUser) && password.equals(validPass)) {
                System.out.println("Login Successful.");
                return true;
            } else {
                attempts--;
                System.out.println("Invalid Credentials.");
                System.out.println("Remaining Attempts: " + attempts);
            }
        }

        return false;
    }
}