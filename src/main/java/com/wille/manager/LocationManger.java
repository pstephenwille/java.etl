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
    public Location getLocation(@Nonnull String zip) {

        final Location cachedLocation = getCachedLocation(zip);
        final Location freshLocation;

        if (cachedLocation == null) {
            freshLocation = getFreshLocation(zip);

            cacheFreshDataInMongo(freshLocation);

            return freshLocation;

        } else {
            return cachedLocation;
        }
    }


    private Location getCachedLocation(@Nonnull String zip) {
        return locationRepo.findByZip(zip);
    }

    private Location getFreshLocation(@Nonnull String zip) {
        return locationBuilder.getLocation(getFreshWeatherData(zip), getFreshZillowData(zip));
    }

    private Weather getFreshWeatherData(@Nonnull String zip) {
        return weatherService.getWeatherData(zip);
    }

    private ZillowDemographics getFreshZillowData(@Nonnull String zip) {
        return zillowService.getZillowData(zip);
    }

    private void cacheFreshDataInMongo(@Nonnull Location freshLocation) {
        Thread asyncMongoWrite = new Thread(() -> {
            try {
                Thread.sleep(3);
                locationRepo.save(freshLocation);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        asyncMongoWrite.start();
    }


}

