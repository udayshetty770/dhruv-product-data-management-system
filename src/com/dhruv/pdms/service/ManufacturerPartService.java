package com.dhruv.pdms.service;

import java.util.Iterator;
import java.util.Scanner;

import com.dhruv.pdms.model.ManufacturerPart;
import com.dhruv.pdms.repository.InMemoryDatabase;
import com.dhruv.pdms.util.NumberGenerator;

public class ManufacturerPartService {

    static Scanner scanner = new Scanner(System.in);

    public static void createManufacturerPart() {

        String number =
                NumberGenerator.generateManufacturerPartNumber();

        System.out.print("Enter Manufacturer Name: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Enter Linked Part Number: ");
        String linkedPart = scanner.nextLine();

        ManufacturerPart mPart =
                new ManufacturerPart(number, manufacturer, linkedPart);

        InMemoryDatabase.manufacturerPartList.add(mPart);

        System.out.println("Manufacturer Part Created Successfully.");
        System.out.println("Generated Number: " + number);
    }

    public static void viewManufacturerParts() {

        if (InMemoryDatabase.manufacturerPartList.isEmpty()) {
            System.out.println("No Manufacturer Parts Found.");
            return;
        }

        for (ManufacturerPart part :
                InMemoryDatabase.manufacturerPartList) {
            System.out.println(part);
        }
    }

    public static void deleteManufacturerPart() {

        System.out.print("Enter MFR Part Number to Delete: ");
        String number = scanner.nextLine();

        Iterator<ManufacturerPart> iterator =
                InMemoryDatabase.manufacturerPartList.iterator();

        while (iterator.hasNext()) {

            ManufacturerPart part = iterator.next();

            if (part.getManufacturerPartNumber().equals(number)) {
                iterator.remove();
                System.out.println("Deleted Successfully.");
                return;
            }
        }

        System.out.println("Record Not Found.");
    }
}