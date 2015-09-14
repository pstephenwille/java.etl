package com.wille.data.service.weather;

import com.wille.data.service.weather.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Service
public class WeatherService {

    @Autowired
    private RestTemplate template;
    @Value("${weather.zip}")
    private String weatherUrl;

    @Nullable
    public Weather getWeatherData(@Nonnull String zip) {
        try {
            return template.getForObject(weatherUrl + zip + ".json", Weather.class);

        } catch (RestClientException e) {
            e.printStackTrace();
            return null;
        }
    }


}
