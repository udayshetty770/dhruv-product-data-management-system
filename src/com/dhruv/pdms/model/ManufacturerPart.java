package com.dhruv.pdms.model;

public class ManufacturerPart {

    private String manufacturerPartNumber;
    private String manufacturerName;
    private String linkedPartNumber;

    public ManufacturerPart() {
    }

    public ManufacturerPart(String manufacturerPartNumber,
                            String manufacturerName,
                            String linkedPartNumber) {
        this.manufacturerPartNumber = manufacturerPartNumber;
        this.manufacturerName = manufacturerName;
        this.linkedPartNumber = linkedPartNumber;
    }

    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    public void setManufacturerPartNumber(String manufacturerPartNumber) {
        this.manufacturerPartNumber = manufacturerPartNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getLinkedPartNumber() {
        return linkedPartNumber;
    }

    public void setLinkedPartNumber(String linkedPartNumber) {
        this.linkedPartNumber = linkedPartNumber;
    }

    @Override
    public String toString() {
        return "MFR Part Number: " + manufacturerPartNumber
                + ", Manufacturer: " + manufacturerName
                + ", Linked Part: " + linkedPartNumber;
    }
}