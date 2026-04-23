package com.dhruv.pdms.model;

public class Manufacturer {

    private String manufacturerId;
    private String name;
    private String country;

    public Manufacturer() {
    }

    public Manufacturer(String manufacturerId, String name, String country) {
        this.manufacturerId = manufacturerId;
        this.name = name;
        this.country = country;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer ID: " + manufacturerId
                + ", Name: " + name
                + ", Country: " + country;
    }
}