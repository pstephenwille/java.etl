package com.wille.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class InitConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public Docket swagger() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(not(regex("/error*")))
//                .build()
//                .pathMapping("/");
//    }

//    @Bean
//    public Docket swaggerSpringMvcPlugin() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("business-api")
//                .select()
//                        /*Ignores controllers annotated with @CustomIgnore*/
//                .apis(not(withClassAnnotation(CustomIgnore.class)) //Selection by RequestHandler
//                        .paths(paths()) // and by paths
//                        .build()
//                        .apiInfo(apiInfo())
//                        .securitySchemes(securitySchemes())
//                        .securityContext(securityContext());
//    }


}
