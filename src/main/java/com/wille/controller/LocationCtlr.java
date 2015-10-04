package com.wille.controller;

import com.wille.data.mongo.model.Location;
import com.wille.manager.LocationManger;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class LocationCtlr {

    @Autowired
    private LocationManger manager;

    /*
    autowire location

    Location(id=560c6702ccf21fe6158f114c, lat=40.70121384, lon=-74.00902557, medianListPricePersquareFoot
    =1477, medianSinglyFamilyHome=no Zillow data available, regionID=61619, temp_f=70, weatherConditions
    =Overcast, weatherIcon=cloudy, weatherIconUrl=http://icons.wxug.com/i/c/k/nt_cloudy.gif, zip=10005)

    */


    @RequestMapping(value="/api/location", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Location getLocation(@RequestParam(value = "zip", defaultValue = "98109") String zip) {
        /* error check for non null zip */
        log.warn("\n\n..............location controller::getlocation.................\n\n");
        return manager.getLocation(zip);
    }

    @RequestMapping(value="/api/woot", method = RequestMethod.GET)
    public String woot() {
        /* error check for non null zip */
        log.warn("\n\n..............woot.................\n\n");
        return "woot woot";
    }

}
/**/