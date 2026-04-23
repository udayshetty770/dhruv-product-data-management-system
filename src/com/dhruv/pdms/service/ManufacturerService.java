package com.dhruv.pdms.service;

import java.util.Iterator;
import java.util.Scanner;

import com.dhruv.pdms.model.Manufacturer;
import com.dhruv.pdms.repository.InMemoryDatabase;
import com.dhruv.pdms.util.NumberGenerator;

public class ManufacturerService {

    static Scanner scanner = new Scanner(System.in);

    public static void createManufacturer() {

        String id = NumberGenerator.generateManufacturerId();

        System.out.print("Enter Manufacturer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Country: ");
        String country = scanner.nextLine();

        Manufacturer manufacturer =
                new Manufacturer(id, name, country);

        InMemoryDatabase.manufacturerList.add(manufacturer);

        System.out.println("Manufacturer Created Successfully.");
        System.out.println("Generated ID: " + id);
    }

    public static void viewManufacturers() {

        if (InMemoryDatabase.manufacturerList.isEmpty()) {
            System.out.println("No Manufacturers Found.");
            return;
        }

        for (Manufacturer manufacturer :
                InMemoryDatabase.manufacturerList) {
            System.out.println(manufacturer);
        }
    }

    public static void deleteManufacturer() {

        System.out.print("Enter Manufacturer ID to Delete: ");
        String id = scanner.nextLine();

        Iterator<Manufacturer> iterator =
                InMemoryDatabase.manufacturerList.iterator();

        while (iterator.hasNext()) {

            Manufacturer manufacturer = iterator.next();

            if (manufacturer.getManufacturerId().equals(id)) {
                iterator.remove();
                System.out.println("Manufacturer Deleted Successfully.");
                return;
            }
        }

        System.out.println("Manufacturer Not Found.");
    }
}