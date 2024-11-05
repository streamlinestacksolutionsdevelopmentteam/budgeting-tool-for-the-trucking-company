package com.trucking.expense_traking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * Main entry point for the Expense Tracking application.
 * This class is responsible for launching the Spring Boot application.
 */
@SpringBootApplication
public class ExpenseTrakingApplication {

	/***
	 * The main method that starts the Spring Boot application.
	 *
	 * @param args command-line arguments passed during application startup
	 */
	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrakingApplication.class, args); //*** Launches the Spring Boot application. ***
	}

}
