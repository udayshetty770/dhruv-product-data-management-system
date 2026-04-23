package com.dhruv.pdms.service;

public class SearchService {

    public static void searchMenu() {

        System.out.println("\n===== SEARCH DATA =====");

        PartService.viewParts();
        DocumentService.viewDocuments();
        ManufacturerService.viewManufacturers();
        ManufacturerPartService.viewManufacturerParts();
    }
}