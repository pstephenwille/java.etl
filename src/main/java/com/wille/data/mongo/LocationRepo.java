package com.wille.data.mongo;


import com.wille.data.mongo.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface LocationRepo extends MongoRepository<Location, String>{

    @Nullable
    Location findByZip(@Nonnull String zip);

}

