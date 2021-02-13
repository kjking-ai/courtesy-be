package com.courtesy.courtesybe.controller;

import com.courtesy.courtesybe.model.Employee;
import com.courtesy.courtesybe.model.User;
import com.courtesy.courtesybe.repository.EmployeeRepository;
import com.courtesy.courtesybe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("employees")
    public List<Employee> getUsers() {
        return this.employeeRepository.findAll();
    }
}
