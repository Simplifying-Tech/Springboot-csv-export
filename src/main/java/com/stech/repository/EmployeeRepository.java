package com.stech.repository;

import org.springframework.data.repository.CrudRepository;

import com.stech.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
