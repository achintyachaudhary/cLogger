package com.clogger.demo;

import com.clogger.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CLoggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }
}
