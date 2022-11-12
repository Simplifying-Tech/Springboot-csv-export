package com.stech;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stech.entity.Employee;
import com.stech.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootOpenCsvApplication implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;
 
    public static void main(String[] args) {
        SpringApplication.run(SpringbootOpenCsvApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        List<Employee> employees = new ArrayList<>();
 
        //creating sample employees
        employees.add(new Employee("Donald", "OConnell", "Donald@gmail.com", 2600));
        employees.add(new Employee("Douglas", "Grant", "Douglas@gmail.com", 2600));
        employees.add(new Employee("Jennifer", "Whalen", "Jennifer@gmail.com", 4400));
        employees.add(new Employee("Michael", "Hartstein", "Michael@gmail.com", 13000));
        employees.add(new Employee("Pat", "Fay", "Pat@gmail.com", 6000));
        employees.add(new Employee("Susan", "Mavris", "Susan@gmail.com", 6500));
        employees.add(new Employee("Hermann", "Baer", "Hermann@gmail.com", 10000));
        employees.add(new Employee("Shelley", "Higgins", "Shelley@gmail.com", 12008));
        employees.add(new Employee("William", "Gietz", "William@gmail.com", 8300));
        employees.add(new Employee("Jack", "Kochhar", "Neena@gmail.com", 17000));
 
 
        employeeRepository.saveAll(employees);
    }
 
}
