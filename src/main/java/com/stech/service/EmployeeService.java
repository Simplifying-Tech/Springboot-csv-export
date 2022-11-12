package com.stech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stech.entity.Employee;
import com.stech.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
 
    public List<Employee> findAll() {
         
        return (List<Employee>) employeeRepository.findAll();
 
    }
 
}
