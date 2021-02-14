package com.courtesy.courtesybe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.courtesy.courtesybe.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
