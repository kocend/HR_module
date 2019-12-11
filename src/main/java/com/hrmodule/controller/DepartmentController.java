package com.hrmodule.controller;

import com.hrmodule.model.Department;
import com.hrmodule.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping(value = "/departments", consumes = "application/json")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @PutMapping(value = "/departments/{id}", consumes = "application/json")
    public void updateDepartment(@PathVariable("id") int ID, @RequestBody Department department){
        System.out.println(department.getName());
        departmentService.updateDepartmentByID(ID,department);
    }

    @DeleteMapping(value = "/departments/{id}")
    public void deleteDepartment(@PathVariable("id") int ID){
        departmentService.deleteDepartmentByID(ID);
    }

    @GetMapping(value = "/departments/{id}")
    public Department getDepartment(@PathVariable("id") int ID){
        return departmentService.getDepartmentByID(ID);
    }

    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
