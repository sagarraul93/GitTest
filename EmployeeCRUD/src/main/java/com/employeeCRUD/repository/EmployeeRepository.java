package com.employeeCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeCRUD.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
