package com.dhruv.pdms.service;

import java.util.Iterator;
import java.util.Scanner;

import com.dhruv.pdms.model.Document;
import com.dhruv.pdms.repository.InMemoryDatabase;
import com.dhruv.pdms.util.NumberGenerator;

public class DocumentService {

    static Scanner scanner = new Scanner(System.in);

    public static void createDocument() {

        String docNumber = NumberGenerator.generateDocumentNumber();

        System.out.print("Enter Document Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Description: ");
        String desc = scanner.nextLine();

        System.out.print("Enter Version: ");
        String version = scanner.nextLine();

        Document document = new Document(docNumber, name, desc, version);

        InMemoryDatabase.documentList.add(document);

        System.out.println("Document Created Successfully.");
        System.out.println("Generated Number: " + docNumber);
    }

    public static void viewDocuments() {

        if (InMemoryDatabase.documentList.isEmpty()) {
            System.out.println("No Documents Found.");
            return;
        }

        for (Document document : InMemoryDatabase.documentList) {
            System.out.println(document);
        }
    }

    public static void deleteDocument() {

        System.out.print("Enter Document Number to Delete: ");
        String number = scanner.nextLine();

        Iterator<Document> iterator = InMemoryDatabase.documentList.iterator();

        while (iterator.hasNext()) {

            Document document = iterator.next();

            if (document.getNumber().equals(number)) {
                iterator.remove();
                System.out.println("Document Deleted Successfully.");
                return;
            }
        }

        System.out.println("Document Not Found.");
    }
}