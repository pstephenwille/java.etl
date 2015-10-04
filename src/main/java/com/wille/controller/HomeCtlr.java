package com.wille.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HomeCtlr {


    @RequestMapping(value = "/api/home", method = RequestMethod.GET)
    public String getHome() {
        log.warn("\n\n..........home controller.................\n\n");
        return "home controller is working";
    }
}
