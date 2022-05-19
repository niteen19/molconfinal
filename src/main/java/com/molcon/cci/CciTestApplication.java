package com.molcon.cci;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class CciTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CciTestApplication.class, args);
    }
}

	

