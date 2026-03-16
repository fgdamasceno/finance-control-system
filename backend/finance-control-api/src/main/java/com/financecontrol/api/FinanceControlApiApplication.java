package com.financecontrol.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration; // temp config

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // temp config
public class FinanceControlApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceControlApiApplication.class, args);
    }

}