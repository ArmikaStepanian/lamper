package com.deks.lamper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LamperApplication {

    public static void main(String[] args) {
        SpringApplication.run(LamperApplication.class, args);
    }
}
