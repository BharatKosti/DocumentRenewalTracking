package com.drt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.drt.model.Permissions;

@Entity
@Table(name="User")
public class UserEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3365744710779111950L;
	@Id
	private String employeeNumber;
	private String employeeName;
	private String designamtion;
	private String employeeEmail;
	private String employeePhoneNumber;
	@ManyToOne
	@JoinColumn(name="companyId")
	private CompanyEntity company;
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
	public CompanyEntity getCompany() {
		return company;
	}
	public void setCompany(CompanyEntity company) {
		this.company = company;
	}
	public Permissions getPermissions() {
		return permissions;
	}
	public void setPermissions(Permissions permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "UserEntity [employeeNumber=" + employeeNumber
				+ ", employeeName=" + employeeName + ", designamtion="
				+ designamtion + ", employeeEmail=" + employeeEmail
				+ ", employeePhoneNumber=" + employeePhoneNumber + ", company="
				+ company + ", permissions=" + permissions + "]";
	}
	
	
	

}
