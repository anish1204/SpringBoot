package com.RESTPRJ.crud_demo.DAO;

import com.RESTPRJ.crud_demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    //define field of EntityManager
    private EntityManager em;

    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        em = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        //Create a query
        TypedQuery<Employee> theQuery = em.createQuery("from Employee ",Employee.class);

        //Execute the Query
        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int id){
      Employee theEmployee =em.find(Employee.class , id);

      return theEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee theEmployee = em.merge(employee);
        return theEmployee;
    }

    @Override
    public void deleteById(int id)
    {
        Employee theEmployee = em.find(Employee.class , id);
        em.remove(theEmployee);
    }

}
