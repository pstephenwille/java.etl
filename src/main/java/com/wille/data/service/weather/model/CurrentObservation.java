package com.wille.data.service.weather.model;

/**
 * Created by JacksonGenerator on 15/09/15.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentObservation {
    @JsonProperty("nowcast")
    private String nowcast;
    @JsonProperty("temp_c")
    private String tempC;
    @JsonProperty("observation_epoch")
    private String observationEpoch;

    public String getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    private String tempF;
    @JsonProperty("wind_kph")
    private String windKph;
    @JsonProperty("wind_mph")
    private String windMph;
    @JsonProperty("wind_degrees")
    private String windDegrees;
    @JsonProperty("temperature_string")
    private String temperatureString;

    public String getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    private String weather;
    @JsonProperty("feelslike_string")
    private String feelslikeString;
    @JsonProperty("precip_today_metric")
    private String precipTodayMetric;
    @JsonProperty("precip_1hr_string")
    private String precip1hrString;

    @JsonProperty("icon_url")
    private String iconUrl;

    public String getIconUrl() {
        return iconUrl;
    }
    @JsonProperty("image")
    private Image image;
    @JsonProperty("UV")
    private String uV;
    @JsonProperty("station_id")
    private String stationId;
    @JsonProperty("local_epoch")
    private String localEpoch;
    @JsonProperty("local_tz_short")
    private String localTzShort;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("precip_1hr_metric")
    private String precip1hrMetric;
    @JsonProperty("pressure_in")
    private String pressureIn;
    @JsonProperty("local_tz_long")
    private String localTzLong;
    @JsonProperty("wind_gust_mph")
    private String windGustMph;
    @JsonProperty("windchill_string")
    private String windchillString;
    @JsonProperty("wind_gust_kph")
    private String windGustKph;
    @JsonProperty("wind_string")
    private String windString;
    @JsonProperty("local_time_rfc822")
    private String localTimeRfc822;
    @JsonProperty("visibility_km")
    private String visibilityKm;
    @JsonProperty("relative_humidity")
    private String relativeHumidity;
    @JsonProperty("pressure_mb")
    private String pressureMb;
    @JsonProperty("observation_time_rfc822")
    private String observationTimeRfc822;
    @JsonProperty("precip_1hr_in")
    private String precip1hrIn;
    @JsonProperty("feelslike_c")
    private String feelslikeC;
    @JsonProperty("observation_time")
    private String observationTime;
    @JsonProperty("feelslike_f")
    private String feelslikeF;
    @JsonProperty("history_url")
    private String historyUrl;
    @JsonProperty("windchill_f")
    private String windchillF;
    @JsonProperty("windchill_c")
    private String windchillC;
    @JsonProperty("precip_today_string")
    private String precipTodayString;

    @JsonProperty("icon")
    private String icon;

    public String getIcon() {
        return icon;
    }
    @JsonProperty("precip_today_in")
    private String precipTodayIn;
    @JsonProperty("solarradiation")
    private String solarradiation;

    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    @JsonProperty("observation_location")
    private ObservationLocation observationLocation;
    @JsonProperty("dewpoint_f")
    private String dewpointF;
    @JsonProperty("display_location")
    private DisplayLocation displayLocation;
    @JsonProperty("dewpoint_string")
    private String dewpointString;
    @JsonProperty("pressure_trend")
    private String pressureTrend;
    @JsonProperty("dewpoint_c")
    private String dewpointC;
    @JsonProperty("estimated")
    private Estimated estimated;
    @JsonProperty("forecast_url")
    private String forecastUrl;
    @JsonProperty("local_tz_offset")
    private String localTzOffset;
    @JsonProperty("heat_index_f")
    private String heatIndexF;
    @JsonProperty("heat_index_c")
    private String heatIndexC;
    @JsonProperty("ob_url")
    private String obUrl;
    @JsonProperty("heat_index_string")
    private String heatIndexString;
    @JsonProperty("visibility_mi")
    private String visibilityMi;
}