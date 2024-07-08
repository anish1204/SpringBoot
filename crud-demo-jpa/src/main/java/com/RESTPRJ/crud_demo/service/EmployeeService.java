package com.RESTPRJ.crud_demo.service;

import com.RESTPRJ.crud_demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);


    Employee save(Employee employee);


    void deleteById(int id);

}
