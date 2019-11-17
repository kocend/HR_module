package com.hrmodule.service;

import com.hrmodule.dao.DataBaseAccessInterface;
import com.hrmodule.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    private DataBaseAccessInterface db;

    public void addEmployee(Employee employee){
        db.addEmployee(employee);
    }

    public void updateEmployeeByID(int ID, Employee employee){
        db.updateEmployeeByID(ID,employee);
    }

    public void deleteEmployeeByID(int ID){
        db.deleteEmployeeByID(ID);
    }

    public Employee getEmployeeByID(int ID){
        return db.getEmployeeByID(ID);
    }

    public List<Employee> getAllEmployees(){
        return db.getAllEmployees();
    }
}
