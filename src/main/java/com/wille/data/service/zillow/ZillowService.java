package com.wille.data.service.zillow;

import com.wille.data.service.zillow.model.ZillowDemographics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Service
public class ZillowService {

    @Autowired private RestTemplate template;
    @Value("${zillow.demographics}") private String zillowUrl;


    @Nullable
    public ZillowDemographics getZillowData(@Nonnull String zip) throws RestClientException {
        try {
            return template.getForObject(zillowUrl + zip, ZillowDemographics.class);

        } catch (RestClientException e) {
//            e.printStackTrace();

            return null;
        }
    }



}
