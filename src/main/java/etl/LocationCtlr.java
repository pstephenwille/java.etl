package etl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationCtlr {

    @RequestMapping("/location")
    public String getLocation(@RequestParam(value = "zip", defaultValue = "98109") String zip) {

        return LocationRepo.getWeatherData();
    }


}
