package com.lab.oops.pojo;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private int deptCode;
	private String email;
	public Employee(String firstName, String lastName, int deptCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		switch(deptCode) {
		  case 1:
			this.department = "Technical"; 
		    break;
		  case 2:
			this.department = "Admin";
		    break;
		  case 3:
			this.department = "Human Resource";
			break;
		  case 4:
			this.department = "Legal";
			break;
		  default:
	        System.out.println("Enter the correct dept. code");
		}
	
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName () {
		return lastName;
	}
	public String getDepartment () {
		return department;
	}
}
