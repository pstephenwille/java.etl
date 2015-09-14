package com.wille.data.service.weather.model;

/**
 * Created by JacksonGenerator on 15/09/15.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    @JsonProperty("features")
    private Features features;
    @JsonProperty("version")
    private String version;
    @JsonProperty("termsofService")
    private String termsofService;
}