//package com.wille.config;
//
//import com.wille.data.mongo.LocationRepo;
//import com.wille.data.mongo.model.Location;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.AsyncResult;
//import org.springframework.scheduling.annotation.EnableAsync;
//
//@EnableAsync
//public abstract class iMongoWrite {
//    @Async
//    public java.util.concurrent.Future<Boolean> asyncMongoWrite(LocationRepo locationRepo, Location location) throws InterruptedException {
//        try {
//            Thread.sleep(3000L);
//            locationRepo.save(location);
//            return new AsyncResult<Boolean>(true);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            return new AsyncResult<Boolean>(false);
//        }
//    }
//}
