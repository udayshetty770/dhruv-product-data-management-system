package com.dhruv.pdms.repository;

import java.util.ArrayList;
import java.util.List;

import com.dhruv.pdms.model.Document;
import com.dhruv.pdms.model.Manufacturer;
import com.dhruv.pdms.model.ManufacturerPart;
import com.dhruv.pdms.model.Part;

public class InMemoryDatabase {

    public static List<Part> partList = new ArrayList<>();
    public static List<Document> documentList = new ArrayList<>();
    public static List<Manufacturer> manufacturerList = new ArrayList<>();
    public static List<ManufacturerPart> manufacturerPartList = new ArrayList<>();
}