package com.wille.data.service.weather.model;

/**
 * Created by JacksonGenerator on 15/09/15.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
    @JsonProperty("link")
    private String link;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
}