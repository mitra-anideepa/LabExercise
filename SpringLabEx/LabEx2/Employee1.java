package com.abc.springcore.main;

import com.abc.springcore.bean.Sbu;

public class Employee1 {

	private int employeeId;
	private String employeeName;
	private double salary;
	private String bussinessUnit;
	private Sbu sbu;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBussinessUnit() {
		return bussinessUnit;
	}

	public void setBussinessUnit(String bussinessUnit) {
		this.bussinessUnit = bussinessUnit;
	}

	public Sbu getSbu() {
		return sbu;
	}

	public void setSbu(Sbu sbu) {
		this.sbu = sbu;
	}

}
