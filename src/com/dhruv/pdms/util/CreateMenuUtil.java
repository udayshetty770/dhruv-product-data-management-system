package com.dhruv.pdms.util;

import java.util.Scanner;

import com.dhruv.pdms.service.DocumentService;
import com.dhruv.pdms.service.ManufacturerPartService;
import com.dhruv.pdms.service.ManufacturerService;
import com.dhruv.pdms.service.PartService;

public class CreateMenuUtil {

    public static void showCreateMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== CREATE DATA =====");
        System.out.println("1. Part");
        System.out.println("2. Document");
        System.out.println("3. Manufacturer");
        System.out.println("4. Manufacturer Part");
        System.out.print("Enter Choice: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                PartService.createPart();
                break;

            case 2:
                DocumentService.createDocument();
                break;

            case 3:
                ManufacturerService.createManufacturer();
                break;

            case 4:
                ManufacturerPartService.createManufacturerPart();
                break;

            default:
                System.out.println("Invalid Choice.");
        }
    }
}