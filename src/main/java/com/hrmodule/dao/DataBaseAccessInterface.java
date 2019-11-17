package com.hrmodule.dao;

import com.hrmodule.model.Employee;

import java.util.List;

public interface DataBaseAccessInterface {

    void addEmployee(Employee employee);
    void updateEmployeeByID(int ID, Employee employee);
    void deleteEmployeeByID(int ID);
    Employee getEmployeeByID(int ID);
    List<Employee> getAllEmployees();

}
