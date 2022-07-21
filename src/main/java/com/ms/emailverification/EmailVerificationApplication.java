package com.ms.emailverification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EmailVerificationApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmailVerificationApplication.class, args);
	}

}
