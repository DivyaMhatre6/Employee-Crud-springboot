package com.itvedant.wingz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itvedant.wingz.models.*;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	/*
	 5 inbuilt methods for CRUD operations 
	 
	 public Employee save(Employee employee); ---> employee.id=0 insert the value
	 public Employee save(Employee employee);----> employee.id   update the value
	 
	 public List<Employee> findAll(); select
	 
	 public list<employee> delete
	 
	 */

}
