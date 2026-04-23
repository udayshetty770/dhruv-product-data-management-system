package com.dhruv.pdms.service;

import java.util.Scanner;

public class DeleteService {

    public static void deleteMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== DELETE MENU =====");
        System.out.println("1. Part");
        System.out.println("2. Document");
        System.out.println("3. Manufacturer");
        System.out.println("4. Manufacturer Part");
        System.out.print("Enter Choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                PartService.deletePart();
                break;

            case 2:
                DocumentService.deleteDocument();
                break;

            case 3:
                ManufacturerService.deleteManufacturer();
                break;

            case 4:
                ManufacturerPartService.deleteManufacturerPart();
                break;

            default:
                System.out.println("Invalid Choice.");
        }
    }
}