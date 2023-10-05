package com.hib.mapping.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="proj")
public class Project {
@Id
private int projectid;
private String projectName;
@ManyToMany(mappedBy ="project")

private List<Employee> employee;

public Project() {
	super();
}

public Project(int projectid, String projectName, List<Employee> employee) {
	super();
	this.projectid = projectid;
	this.projectName = projectName;
	this.employee = employee;
}

public int getProjectid() {
	return projectid;
}

public void setProjectid(int projectid) {
	this.projectid = projectid;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public List<Employee> getEmployee() {
	return employee;
}

public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}

@Override
public String toString() {
	return "Project [projectid=" + projectid + ", projectName=" + projectName + ", employee=" + employee + "]";
}



	
}
