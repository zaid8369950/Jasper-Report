package com.javatechie.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.report.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
