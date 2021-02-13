package com.courtesy.courtesybe.repository;

import com.courtesy.courtesybe.model.Employee;
import com.courtesy.courtesybe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

