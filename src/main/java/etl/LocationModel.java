package etl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationModel {

    
    private String regionID;
    private Long lat;
    private Long lon;
    private String medianSinglyFamilyHome;
    private String medianListPricePersquareFoot;
    private String weatherConditions;
    private String weatherIcon;
    private String weatherIconUrl;
    private String temp_f;

}
