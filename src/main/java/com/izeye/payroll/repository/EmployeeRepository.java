package com.izeye.payroll.repository;

import org.springframework.data.repository.CrudRepository;

import com.izeye.payroll.domain.Employee;

/**
 * Repository for employees.
 *
 * @author Johnny Lim
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
