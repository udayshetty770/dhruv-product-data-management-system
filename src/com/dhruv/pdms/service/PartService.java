package com.dhruv.pdms.service;

import java.util.Iterator;
import java.util.Scanner;

import com.dhruv.pdms.model.Part;
import com.dhruv.pdms.repository.InMemoryDatabase;
import com.dhruv.pdms.util.NumberGenerator;

public class PartService {

    static Scanner scanner = new Scanner(System.in);

    public static void createPart() {

        String partNumber = NumberGenerator.generatePartNumber();

        System.out.println("\n===== CREATE PART =====");
        System.out.println("Generated Part Number : " + partNumber);

        System.out.print("Enter Part Type: ");
        String name = scanner.nextLine();

        System.out.print("Enter Description: ");
        String desc = scanner.nextLine();

        System.out.print("Enter Part UOM: ");
        String type = scanner.nextLine();

        Part part = new Part(partNumber, name, desc, type);

        InMemoryDatabase.partList.add(part);

        System.out.println("Part Created Successfully.");
    }

    public static void viewParts() {

        if (InMemoryDatabase.partList.isEmpty()) {
            System.out.println("No Parts Found.");
            return;
        }

        System.out.println("\n===== PART LIST =====");

        for (Part part : InMemoryDatabase.partList) {
            System.out.println(part);
        }
    }

    public static void deletePart() {

        System.out.print("Enter Part Number to Delete: ");
        String number = scanner.nextLine();

        Iterator<Part> iterator = InMemoryDatabase.partList.iterator();

        while (iterator.hasNext()) {

            Part part = iterator.next();

            if (part.getNumber().equals(number)) {
                iterator.remove();
                System.out.println("Part Deleted Successfully.");
                return;
            }
        }

        System.out.println("Part Not Found.");
    }
}