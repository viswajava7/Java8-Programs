package com.programs;

Public class EmployeeStreamDemo{
	
}

class Employee {

	int id;
	String Name;
	String gendar;
	String department;
	int yearOfJoining;
	double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGendar() {
		return gendar;
	}

	public void setGendar(String gendar) {
		this.gendar = gendar;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String gendar, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		Name = name;
		this.gendar = gendar;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
