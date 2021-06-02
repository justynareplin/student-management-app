package com.example.Spring.Boot.Starts.employees;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EmployeeService {
    @GetMapping(path="api/v2/employyes")
    public List<Employee> getEmployees(){
        return List.of(
                new Employee("Mariusz", "Kwiatkowski", 22)
        );
    }

}
