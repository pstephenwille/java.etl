package com.wille.data.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Location {
    @Id
    private String id;
    private String lat;
    private String lon;
    private String medianListPricePersquareFoot;
    private String medianSinglyFamilyHome;
    private String regionID;
    private String temp_f;
    private String weatherConditions;
    private String weatherIcon;
    private String weatherIconUrl;
    private String zip;

}
