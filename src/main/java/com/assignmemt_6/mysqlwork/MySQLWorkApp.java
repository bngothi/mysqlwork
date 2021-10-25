package com.assignmemt_6.mysqlwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class MySQLWorkApp implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * A program that enables user to add values to a database.
	 * @param args  one arg the path to add values to a database
	 * @throws Exception if there is error adding values
	 */

	public static void main(String[] args) {

		SpringApplication.run(MySQLWorkApp.class, args);
	}

	@Override
	// add the values to be added to the database
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO address (id, first_name, last_name, street_address, additional_address, city_or_town, state, zip_code, email_address, telephone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int result = jdbcTemplate.update(sql, 1175,"Joe", "Right", "122 Bell street", "55201 West","New-York1", "Newark1", "003441", "best1@gmail.com", "701-234-7788");
		if (result > 0) {
			System.out.println("A new row has been inserted.");
		}

	}
}
