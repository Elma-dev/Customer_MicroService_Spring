package dev.elma.customer_microservice_spring;

import dev.elma.customer_microservice_spring.entities.Customer;
import dev.elma.customer_microservice_spring.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
@AllArgsConstructor
public class CustomerMicroServiceSpringApplication implements CommandLineRunner {

    CustomerRepository customerRepository;
    public static void main(String[] args) {
        SpringApplication.run(CustomerMicroServiceSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Mohammed","Ahmed","Ali","Nawal")
                .forEach(name->{
                    Customer c=Customer.builder()
                            .name(name).email(name+"@gmail.com").build();
                    customerRepository.save(c);
                });

    }
}
