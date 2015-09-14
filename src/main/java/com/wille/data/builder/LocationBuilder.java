package com.wille.data.builder;

import com.wille.data.mongo.model.Location;
import com.wille.data.service.weather.model.Weather;
import com.wille.data.service.zillow.model.ZillowDemographics;
import org.springframework.stereotype.Component;

@Component
public class LocationBuilder {

    public Location getLocation(Weather weather, ZillowDemographics zillowDemographics) {

        Location location = new Location();

        location.setZip( weather.getCurrentObservation().getDisplayLocation().getZip() );
        location.setLat( weather.getCurrentObservation().getObservationLocation().getLatitude() );
        location.setLon( weather.getCurrentObservation().getObservationLocation().getLongitude() );
        location.setMedianListPricePersquareFoot(
                zillowDemographics.getResponse()
                        .getPages().get(0)
                        .getTables().get(0)
                        .getData().get(8)
                        .getValues()
                        .getZip()
                        .getValue()
        );
        location.setMedianSinglyFamilyHome(
                zillowDemographics.getResponse()
                        .getPages().get(0)
                        .getTables().get(0)
                        .getData().get(1)
                        .getValues()
                        .getZip()
                        .getValue()
        );
        location.setRegionID(
                zillowDemographics.getResponse().getRegion().getId()
        );
        location.setTemp_f( weather.getCurrentObservation().getTempF().toString() );
        location.setWeatherConditions( weather.getCurrentObservation().getWeather() );
        location.setWeatherIcon( weather.getCurrentObservation().getIcon() );
        location.setWeatherIconUrl( weather.getCurrentObservation().getIconUrl() );

        return location;
    }

}
