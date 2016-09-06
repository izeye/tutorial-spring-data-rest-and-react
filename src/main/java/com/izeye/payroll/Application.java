package com.izeye.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.izeye.payroll.domain.Employee;
import com.izeye.payroll.repository.EmployeeRepository;

/**
 * Application.
 *
 * @author Johnny Lim
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
