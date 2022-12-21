package com.javatechie.report.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "EMPLOYEE_TBL")
public class Employee {
	 @Id
    private int id; 
    private String name;
    private String designation;
    private double salary;
    private String doj;
}

