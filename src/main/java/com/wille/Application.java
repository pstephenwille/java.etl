package com.wille;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Calendar;

@SpringBootApplication
@ComponentScan("com.wille")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getFirstDayOfWeek());

    }
}
