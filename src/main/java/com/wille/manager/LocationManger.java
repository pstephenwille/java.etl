package com.wille.manager;

import com.wille.data.builder.LocationBuilder;
import com.wille.data.mongo.LocationRepo;
import com.wille.data.mongo.model.Location;
import com.wille.data.service.weather.WeatherService;
import com.wille.data.service.weather.model.Weather;
import com.wille.data.service.zillow.ZillowService;
import com.wille.data.service.zillow.model.ZillowDemographics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

/**
 * creates LocationModel objects
 * aggregate diff data sources
 * make remote call for data
 * cache in mongo
 * <p>
 * http://api.wunderground.com/api/93ef617c6ad5f862/conditions/q/zip/94101.json
 * http://www.zillow.com/webservice/GetDemographics.htm?zws-id=X1-ZWz1a3j8v7by8b_64j9s&zip=94101
 */
@Component
public class LocationManger {


    @Autowired
    private LocationBuilder locationBuilder;
    @Autowired
    private LocationRepo locationRepo;
    @Autowired
    private WeatherService weatherService;
    @Autowired
    private ZillowService zillowService;


    @Nonnull
    public String getLocation(@Nonnull String zip) {

        final Location mongoLocation = locationRepo.findByZip(zip);

        if (mongoLocation == null) {

            final Weather weather = weatherService.getWeatherData(zip);
            final ZillowDemographics zillowDemographics = zillowService.getZillowData(zip);

            if (weather == null || zillowDemographics == null) {
                return "unable to get data";
            }


            final Location location = locationBuilder.getLocation(weather, zillowDemographics);

            Thread asyncMongoWrite = new Thread(() -> {
                try {
                    locationRepo.save(location);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            asyncMongoWrite.start();


            return location.toString();
        }

        return mongoLocation.toString();
    }

}

