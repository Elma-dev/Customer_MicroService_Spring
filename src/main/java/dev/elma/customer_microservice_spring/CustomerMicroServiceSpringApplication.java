package dev.elma.customer_microservice_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerMicroServiceSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CustomerMicroServiceSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
