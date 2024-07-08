package com.RESTPRJ.crud_demo.DAO;
import com.RESTPRJ.crud_demo.entity.Employee;

import java.util.List;


public interface EmployeeDAO
{
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
