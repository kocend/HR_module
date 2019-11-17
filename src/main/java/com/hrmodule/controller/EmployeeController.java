package com.hrmodule.controller;

import com.hrmodule.model.Employee;
import com.hrmodule.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/employees", consumes = "application/json")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @PutMapping(value = "/employees/{id}", consumes = "application/json")
    public void updateEmployee(@PathVariable("id") int ID, @RequestBody Employee employee){
        employeeService.updateEmployeeByID(ID,employee);
    }

    @DeleteMapping(value = "/employees/{id}")
    public void deleteEmployee(@PathVariable("id") int ID){
        employeeService.deleteEmployeeByID(ID);
    }

    @GetMapping(value = "/employees/{id}")
    public Employee getEmployee(@PathVariable("id") int ID){
        return employeeService.getEmployeeByID(ID);
    }

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

}
