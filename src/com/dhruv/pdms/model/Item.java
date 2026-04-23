package com.dhruv.pdms.model;

public class Item {

    private String number;
    private String name;
    private String description;

    public Item() {
    }

    public Item(String number, String name, String description) {
        this.number = number;
        this.name = name;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}