package com.wille.data.service.zillow.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class ZillowRegion {
    @Getter @Setter private String name = "no 'name' data available";
    @Getter @Setter private String id = "no 'id' data available";
    @Getter @Setter private String state = "no 'state' data available";
    @Getter @Setter private String city = "no 'city' data available";
    @Getter @Setter private String zip = "no 'zip' data available";
    @Getter @Setter private String latitude = "no 'latitude' data available";
    @Getter @Setter private String longitude = "no 'longitude' data available";


}