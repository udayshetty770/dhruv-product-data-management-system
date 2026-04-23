package com.dhruv.pdms.util;

public class NumberGenerator {

    private static int partCounter = 100;
    private static int documentCounter = 200;
    private static int manufacturerCounter = 300;
    private static int manufacturerPartCounter = 400;

    public static String generatePartNumber() {
        return "100-262-" + partCounter++;
    }

    public static String generateDocumentNumber() {
        return "DOC-" + documentCounter++;
    }

    public static String generateManufacturerId() {
        return "MFR-" + manufacturerCounter++;
    }

    public static String generateManufacturerPartNumber() {
        return "MFP-" + manufacturerPartCounter++;
    }
}