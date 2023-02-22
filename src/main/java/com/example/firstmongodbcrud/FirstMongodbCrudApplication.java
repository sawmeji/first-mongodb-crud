package com.example.firstmongodbcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.firstmongodbcrud.dao")
public class FirstMongodbCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstMongodbCrudApplication.class, args);
    }

}
