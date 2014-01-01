package com.drt.model;

public class User {
	
	private String employeeNumber;
	private String employeeName;
	private String designamtion;
	private String employeeEmail;
	private String employeePhoneNumber;
	private Permissions permissions;
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignamtion() {
		return designamtion;
	}
	public void setDesignamtion(String designamtion) {
		this.designamtion = designamtion;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}
	public void setEmployeePhoneNumber(String employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}
	
	public Permissions getPermissions() {
		return permissions;
	}
	public void setPermissions(Permissions permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "User [employeeNumber=" + employeeNumber + ", employeeName="
				+ employeeName + ", designamtion=" + designamtion
				+ ", employeeEmail=" + employeeEmail + ", employeePhoneNumber="
				+ employeePhoneNumber + ", permissions=" + permissions + "]";
	}
	
	
}
