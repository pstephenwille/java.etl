package com.wille.data.service.weather.model;

/**
 * Created by JacksonGenerator on 15/09/15.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Features {
    @JsonProperty("conditions")
    private Integer conditions;
}