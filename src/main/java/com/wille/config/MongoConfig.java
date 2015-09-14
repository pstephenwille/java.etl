package com.wille.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
public class MongoConfig{

    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost", 27017);
    }

    @Bean
    public MongoDbFactory mongoDbFactory(Mongo mongo) {
        return new SimpleMongoDbFactory(mongo, "locations");
    }

    @Bean
    public MappingMongoConverter mongoConverter(MongoDbFactory mongoDbFactory) {
        final MongoMappingContext mappingContext = new MongoMappingContext();
        final DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);
        return new MappingMongoConverter(dbRefResolver, mappingContext);
    }


    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory, MappingMongoConverter mappingMongoConverter) {
        return new MongoTemplate(mongoDbFactory, mappingMongoConverter);
    }

}



