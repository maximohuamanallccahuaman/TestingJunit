package com.example.demojunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoJunitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJunitApplication.class, args);
    }

}
