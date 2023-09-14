package com.employeeCRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_management")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long emp_id;
	private String emp_name;
	private String emp_email;
}
