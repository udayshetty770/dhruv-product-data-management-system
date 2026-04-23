package com.dhruv.pdms.util;

import java.util.Scanner;

import com.dhruv.pdms.service.DeleteService;
import com.dhruv.pdms.service.SearchService;

public class MenuUtil {

    public static void showMainMenu() {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Create Data");
            System.out.println("2. Search Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Enter valid number.");
                continue;
            }

            switch (choice) {

                case 1:
                    CreateMenuUtil.showCreateMenu();
                    break;

                case 2:
                    SearchService.searchMenu();
                    break;

                case 3:
                    DeleteService.deleteMenu();
                    break;

                case 4:
                    System.out.println("Application Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}