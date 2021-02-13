package com.courtesy.courtesybe;

import com.courtesy.courtesybe.model.Employee;
import com.courtesy.courtesybe.model.User;
import com.courtesy.courtesybe.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.courtesy.courtesybe.repository.UserRepository;


@SpringBootApplication
public class CourtesyBeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CourtesyBeApplication.class, args);
	}
		Employee kyle = new Employee ("Kyle",5000);
		Employee hunter = new Employee("Hunter", 50000);

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) {
		this.userRepository.save(new User("Kyle", "King"));
		this.userRepository.save(new User("Emily", "Pham"));
		this.userRepository.save(new User("Hunter", "Blair"));
		this.userRepository.save(new User("me","me"));
		this.employeeRepository.save(kyle);
		this.employeeRepository.save(hunter);

	}
}