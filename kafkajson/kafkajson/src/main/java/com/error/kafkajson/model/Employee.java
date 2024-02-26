package com.error.kafkajson.model;

public class Employee {
	private int id;
	private String empname;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String empname) {
		super();
		this.id = id;
		this.empname = empname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + "]";
	}
	
	

}
