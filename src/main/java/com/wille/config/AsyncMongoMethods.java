//package com.wille.config;
//
//import com.wille.data.mongo.LocationRepo;
//import com.wille.data.mongo.model.Location;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.AsyncResult;
//import org.springframework.scheduling.annotation.EnableAsync;
//
//import java.util.concurrent.Future;
//
//@Configuration
//@EnableAsync
//public class AsyncMongoMethods {
//
//    @Bean
//    @Async
//    public Future<Boolean> asyncMongoWrite(LocationRepo locationRepo, Location location) throws InterruptedException {
//        try {
//            Thread.sleep(3000L);
//            locationRepo.save(location);
//            return new AsyncResult<Boolean>(true);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            return new AsyncResult<Boolean>(false);
//        }
//    }
//
//
//}
//
//
//
