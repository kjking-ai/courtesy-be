package com.courtesy.courtesybe;

import com.courtesy.courtesybe.model.User;
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

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) {
		this.userRepository.save(new User("Kyle", "King"));
		this.userRepository.save(new User("Emily", "Pham"));
		this.userRepository.save(new User("Hunter", "Blair"));
	}
}