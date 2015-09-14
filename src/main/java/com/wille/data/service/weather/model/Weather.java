package com.wille.data.service.weather.model;

/**
 * Created by JacksonGenerator on 15/09/15.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    @JsonProperty("response")
    private Response response;

    @JsonProperty("current_observation")
    private CurrentObservation currentObservation;

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }
}