package com.tap.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class employee 
{
	@Id
	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="department")
	private String department;
	
	@Column(name="salary")
	private int salary;
	
	public employee(int emp_id, String name, String department, int salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public employee() {
		super();
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [emp_id=" + emp_id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ "]";
	}
	
	
}
