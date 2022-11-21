package com.example.CRUD_Backend.service;

import com.example.CRUD_Backend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);

    Employee updateEmployee(Employee employee, long id);

    void deleteEmployee(long id);
//    Employee getEmployeeByName(String name);
}
