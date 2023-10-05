package com.hib.mapping.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="empl")
public class Employee {
@Id
private int empid;
private String empName;
@ManyToMany

private List<Project> project;

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public List<Project> getProject() {
	return project;
}

public void setProject(List<Project> project) {
	this.project = project;
}

public Employee(int empid, String empName, List<Project> project) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.project = project;
}

public Employee() {
	super();
} 

@Override
public String toString() {
	return "Employee [empid=" + empid + ", empName=" + empName + ", project=" + project + "]";
}
	
	
}
