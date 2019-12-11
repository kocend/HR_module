package com.hrmodule.dao;

import com.hrmodule.model.Contract;
import com.hrmodule.model.Department;
import com.hrmodule.model.Employee;
import com.hrmodule.model.Holiday;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class MySQLDataBaseAccessImpl implements DataBaseAccessInterface {


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void addDepartment(Department department) {
        entityManager.persist(department);
    }

    @Override
    public void updateDepartmentByID(int ID, Department department) {
        System.out.println(department.getName());
        Department dep = getDepartmentByID(ID);
        dep.setName(department.getName());
        entityManager.flush();
        System.out.println(department.getName());
    }

    @Override
    public void deleteDepartmentByID(int ID) {
        entityManager.remove(getDepartmentByID(ID));
    }

    @Override
    public Department getDepartmentByID(int ID) {
        return entityManager.find(Department.class,ID);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Department> getAllDepartments() {
        return (List<Department>)entityManager.createQuery("FROM Department").getResultList();
    }





    @Override
    public void addEmployee(Employee employee) {
            entityManager.persist(employee);
    }

    @Override
    public void updateEmployeeByID(int ID, Employee employee) {
        Employee emp = getEmployeeByID(ID);
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setCity(employee.getCity());
        emp.setStreet(employee.getStreet());
        emp.setNumber(employee.getNumber());
        emp.setPostcode(employee.getPostcode());
        emp.setNationality(employee.getNationality());
        emp.setEducation(employee.getEducation());
        emp.setBackend(employee.isBackend());
        emp.setFrontend(employee.isFrontend());
        emp.setSpanish(employee.getSpanish());
        emp.setRussian(employee.getRussian());
        emp.setFrench(employee.getFrench());
        emp.setGerman(employee.getGerman());
        emp.setEnglish(employee.getEnglish());
        emp.setDepartmentID(employee.getDepartmentID());
        entityManager.flush();
    }

    @Override
    public void deleteEmployeeByID(int ID) {
        entityManager.remove(getEmployeeByID(ID));
    }

    @Override
    public Employee getEmployeeByID(int ID) {
        return entityManager.find(Employee.class,ID);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>)entityManager.createQuery("FROM Employee").getResultList();
    }





    @Override
    public void addContract(Contract contract){
        entityManager.persist(contract);
    }

    @Override
    public void updateContractByID(int ID, Contract contract) {
        Contract con = getContractByID(ID);
        con.setEmploymentDate(contract.getEmploymentDate());
        con.setBaseSalary(contract.getBaseSalary());
        con.setNetSalary(contract.getNetSalary());
        con.setTypeOfContractID(contract.getTypeOfContractID());
        con.setEmployeeID(contract.getEmployeeID());
        entityManager.flush();
    }

    @Override
    public void deleteContractByID(int ID) {
        entityManager.remove(getContractByID(ID));
    }

    @Override
    public Contract getContractByID(int ID) {
        return entityManager.find(Contract.class,ID);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Contract> getAllContracts() {
        return (List<Contract>)entityManager.createQuery("FROM Contract").getResultList();
    }





    @Override
    public void addHoliday(Holiday holiday) {
        entityManager.persist(holiday);
    }

    @Override
    public void updateHolidayByID(int ID, Holiday holiday) {
        Holiday hol = getHolidayByID(ID);
        hol.setStartDate(holiday.getStartDate());
        hol.setEndDate(holiday.getEndDate());
        hol.setReason(holiday.getReason());
        entityManager.flush();
    }

    @Override
    public void deleteHolidayByID(int ID) {
        entityManager.remove(getHolidayByID(ID));
    }

    @Override
    public Holiday getHolidayByID(int ID) {
        return entityManager.find(Holiday.class, ID);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Holiday> getAllHolidays() {
        return (List<Holiday>)entityManager.createQuery("FROM Holiday").getResultList();
    }


}
