package com.hrmodule.dao;

import com.hrmodule.model.Employee;
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
    public void addEmployee(Employee employee) {
            entityManager.persist(employee);
    }

    @Override
    public void updateEmployeeByID(int ID, Employee employee) {
        Employee emp = getEmployeeByID(ID);
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setPhoneNumber(employee.getPhoneNumber());
        emp.setCity(employee.getCity());
        emp.setStreet(employee.getStreet());
        emp.setNumber(employee.getNumber());
        emp.setPostcode(employee.getPostcode());
        emp.setNationality(employee.getNationality());
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
}
