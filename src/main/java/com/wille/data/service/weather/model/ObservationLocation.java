package com.wille.data.service.weather.model;

/**
 * Created by JacksonGenerator on 15/09/15.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservationLocation {

    @JsonProperty("city")
    private String city;

    @JsonProperty("country")
    private String country;

    @JsonProperty("country_iso3166")
    private String countryIso3166;

    @JsonProperty("elevation")
    private String elevation;

    @JsonProperty("full")
    private String full;

    @JsonProperty("latitude")
    private String latitude;

    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("state")
    private String state;

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }
}