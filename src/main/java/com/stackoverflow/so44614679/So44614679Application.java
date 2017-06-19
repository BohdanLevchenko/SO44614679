package com.stackoverflow.so44614679;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class So44614679Application {

	public static void main(String[] args) {
		SpringApplication.run(So44614679Application.class, args);
	}

	@RestController
	public static class Api {

		private final JdbcTemplate jdbcTemplate;

		@Autowired
		public Api(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

		@GetMapping
		public String time() {
			final String timestamp = jdbcTemplate.queryForObject("select current_timestamp", String.class);
			return "Database clock is set to: " + timestamp;
		}
	}
}
