package com.assignment_6.mysqlwork.datacreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AddDBValuesApp implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * A program that enables user to add values to a database.
	 * @param args  one arg the path to add values to a database
	 * @throws Exception if there is error adding values
	 */

	public static void main(String[] args) {

		SpringApplication.run(AddDBValuesApp.class, args);
	}

	@Override
	// add the values to be added to the database
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO address (id, first_name, last_name, street_address, additional_address, city_or_town, state, zip_code, email_address, telephone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int result = jdbcTemplate.update(sql, 1178,"jane", "W", "1 Reder street", "88201 East","York1", "San1", "993441", "best21@gmail.com", "721-234-7788");
		if (result > 0) {
			System.out.println("A new row has been inserted.");
		}

	}
}
