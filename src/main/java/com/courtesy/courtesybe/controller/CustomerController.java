package com.courtesy.courtesybe.controller;

import com.courtesy.courtesybe.model.Customer;
import com.courtesy.courtesybe.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("customer")
    public List<Customer> getCustomers() {
        return this.customerRepository.findAll();
    }
}
