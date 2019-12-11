package com.hrmodule.service;

import com.hrmodule.dao.DataBaseAccessInterface;
import com.hrmodule.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentService {

    @Autowired
    private DataBaseAccessInterface db;

    public void addDepartment(Department department){
        db.addDepartment(department);
    }

    public void updateDepartmentByID(int ID, Department department){
        System.out.println(department.getName());
        db.updateDepartmentByID(ID,department);
    }

    public void deleteDepartmentByID(int ID){
        db.deleteDepartmentByID(ID);
    }

    public Department getDepartmentByID(int ID){
        return db.getDepartmentByID(ID);
    }

    public List<Department> getAllDepartments(){
        return db.getAllDepartments();
    }
}
