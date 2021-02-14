package com.courtesy.courtesybe;

import com.courtesy.courtesybe.model.Customer;
import com.courtesy.courtesybe.model.Employee;
import com.courtesy.courtesybe.model.User;
import com.courtesy.courtesybe.repository.EmployeeRepository;
import com.courtesy.courtesybe.repository.UserRepository;
import com.courtesy.courtesybe.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;


@SpringBootApplication
public class CourtesyBeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CourtesyBeApplication.class, args);
	}
		Employee kyle = new Employee ("Kyle",5000, "Manager");
		Employee hunter = new Employee("Hunter", 50000, "Manager");
		Customer firstCustomer = new Customer("Test","Last","test@email.com","520-820-5053","1234-1234-1234-1234", true);

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private CustomerRepository customerRepository;


	@Override
	public void run(String... args) {
		this.userRepository.save(new User("Kyle", "King"));
		this.userRepository.save(new User("Emily", "Pham"));
		this.userRepository.save(new User("Hunter", "Blair"));
		this.userRepository.save(new User("me","me"));
		this.employeeRepository.save(kyle);
		this.employeeRepository.save(hunter);
		this.customerRepository.save(firstCustomer);

	}
}