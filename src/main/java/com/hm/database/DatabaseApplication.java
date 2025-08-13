package com.hm.database;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

	private final DataSource dataSource;
	
	public DatabaseApplication(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Starting Database application...");
		log.info("DataSource: {}", dataSource.toString());
		log.info("Database application started successfully.");
	}

}
