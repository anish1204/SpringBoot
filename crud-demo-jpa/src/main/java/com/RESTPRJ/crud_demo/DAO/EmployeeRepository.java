package com.RESTPRJ.crud_demo.DAO;

import com.RESTPRJ.crud_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
