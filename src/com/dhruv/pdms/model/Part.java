package com.dhruv.pdms.model;

public class Part extends Item {

    private String partType;

    public Part() {
    }

    public Part(String number, String name, String description, String partType) {
        super(number, name, description);
        this.partType = partType;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    @Override
    public String toString() {

        return "Part Number: " + getNumber()
                + ", Part Type: " + getName()
                + ", Description: " + getDescription()
                + ", Part UOM: " + partType;
    }
}