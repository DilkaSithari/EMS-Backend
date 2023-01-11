package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin

public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    //get all employees
    @GetMapping("/employees")

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    //create employee rest api
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
