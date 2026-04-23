package com.dhruv.pdms.model;

public class Document extends Item {

    private String version;

    public Document() {
    }

    public Document(String number, String name, String description, String version) {
        super(number, name, description);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Document Number: " + getNumber()
                + ", Name: " + getName()
                + ", Description: " + getDescription()
                + ", Version: " + version;
    }
}