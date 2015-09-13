package etl;

import org.springframework.web.client.RestTemplate;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.Reader;


public class LocationRepo {
    /* creates LocationModel objects
    * make remote call for data
    * cache in mongo
    *
    * http://api.wunderground.com/api/93ef617c6ad5f862/conditions/q/zip/98109.json
    * http://www.zillow.com/webservice/GetDemographics.htm?zws-id=X1-ZWz1a3j8v7by8b_64j9s&zip=98109
    * */

    public static String getZillowData() {
        RestTemplate template = new RestTemplate();
        LocationModel location = template.getForObject(
                "http://www.zillow.com/webservice/GetDemographics.htm?zws-id=X1-ZWz1a3j8v7by8b_64j9s&zip=98109",
                LocationModel.class);
        System.out.println("repo" + location);

        return "hi from Repo";
    }

    public static String getWeatherData() {
        RestTemplate template = new RestTemplate();

        Reader reader = template.getForObject(
                "http://api.wunderground.com/api/93ef617c6ad5f862/conditions/q/zip/98109.json",
                Reader.class);

        JsonReader jsonReader = Json.createReader(reader);
        JsonObject object = jsonReader.readObject();
        jsonReader.close();


        System.out.println("repo - " + object);

        return "hi from weather repo";
    }

}
