package dev.elma.customer_microservice_spring.repositories;

import dev.elma.customer_microservice_spring.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
