package com.wille.data.service.weather.model;

/**
 * Created by JacksonGenerator on 15/09/15.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayLocation {
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("magic")
    private String magic;
    @JsonProperty("elevation")
    private String elevation;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_iso3166")
    private String countryIso3166;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state_name")
    private String stateName;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("wmo")
    private String wmo;
    @JsonProperty("state")
    private String state;
    @JsonProperty("full")
    private String full;
    @JsonProperty("longitude")
    private String longitude;
}