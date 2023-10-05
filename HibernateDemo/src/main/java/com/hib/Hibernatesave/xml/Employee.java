package com.hib.Hibernatesave.xml;

public class Employee {

	private int id;
	private String name,password , email,country;
	public int getId() {
		return id;
	 }
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee(int id, String name, String password, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.country = country;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", country="
				+ country + "]";
	}
	
	
	
}
