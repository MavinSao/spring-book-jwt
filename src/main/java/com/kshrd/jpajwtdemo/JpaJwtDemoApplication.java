package com.kshrd.jpajwtdemo;

import com.kshrd.jpajwtdemo.domain.Role;
import com.kshrd.jpajwtdemo.domain.User;
import com.kshrd.jpajwtdemo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JpaJwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaJwtDemoApplication.class, args);
	}


	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {

			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));

			userService.saveUser(new User(null, "Sao Mavin", "mavinsao", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Sok Polen", "polensok", "1234", new ArrayList<>()));

			userService.addRoleToUser("mavinsao","ROLE_USER");
			userService.addRoleToUser("polensok","ROLE_ADMIN");

		};
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
