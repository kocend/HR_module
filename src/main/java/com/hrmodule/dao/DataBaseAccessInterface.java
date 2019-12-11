package com.hrmodule.dao;

import com.hrmodule.model.Contract;
import com.hrmodule.model.Department;
import com.hrmodule.model.Employee;
import com.hrmodule.model.Holiday;

import java.util.List;

public interface DataBaseAccessInterface {

    void addDepartment(Department department);
    void updateDepartmentByID(int ID, Department department);
    void deleteDepartmentByID(int ID);
    Department getDepartmentByID(int ID);
    List<Department> getAllDepartments();

    void addEmployee(Employee employee);
    void updateEmployeeByID(int ID, Employee employee);
    void deleteEmployeeByID(int ID);
    Employee getEmployeeByID(int ID);
    List<Employee> getAllEmployees();

    void addContract(Contract contract);
    void updateContractByID(int ID, Contract contract);
    void deleteContractByID(int ID);
    Contract getContractByID(int ID);
    List<Contract> getAllContracts();

    void addHoliday(Holiday holiday);
    void updateHolidayByID(int ID, Holiday holiday);
    void deleteHolidayByID(int ID);
    Holiday getHolidayByID(int ID);
    List<Holiday> getAllHolidays();

}
