package com.wille.controller;

import com.wille.manager.LocationManger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/location")
public class LocationCtlr {

    @Autowired private LocationManger manager;

    /*
    autowire location

    */


    @RequestMapping
    public String getLocation(@RequestParam(value = "zip", defaultValue = "98109") String zip) {
        /* error check for non null zip */
        return manager.getLocation(zip);
    }
}
