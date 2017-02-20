package com.wille.data.service.zillow;

import com.wille.data.service.zillow.model.ZillowDemographics;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.Verifications;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class ZillowServiceTest {

    @Tested
    ZillowService testing;

    @Injectable
    RestTemplate template;

    @Injectable
    String zillowUrl = "zillowUrl";

    @Test
    public void testGetZillowData(@Injectable final ZillowDemographics demographics) throws Exception {

        new Expectations() {{
            template.getForObject("zillowUrlTest", ZillowDemographics.class);
            result = demographics;
        }};

        assertThat(testing.getZillowData("Test")).isExactlyInstanceOf(ZillowDemographics.class);
    }

    @Test
    public void testGetZillowDataException() throws Exception {
        new Expectations() {{
            template.getForObject("zillowUrlTest", ZillowDemographics.class);
            result = new RestClientException("test");
        }};

        assertThat(testing.getZillowData("Test")).isNull();

        new Verifications() {{
            System.out.println("error");
        }};
    }


}

