package com.RESTPRJ.crud_demo.DAO;

import com.RESTPRJ.crud_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
