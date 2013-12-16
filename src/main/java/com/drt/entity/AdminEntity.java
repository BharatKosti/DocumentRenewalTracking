package com.drt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class AdminEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	private String adminEntity;
	private String employeeNumber;
	private String adminName;
	private String designamtion;
	private String email;
	private String adminPhoneNumber;
	@ManyToOne
	@JoinColumn(name="companyId")
	private CompanyEntity company;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminEntity() {
		return adminEntity;
	}
	public void setAdminEntity(String adminEntity) {
		this.adminEntity = adminEntity;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getDesignamtion() {
		return designamtion;
	}
	public void setDesignamtion(String designamtion) {
		this.designamtion = designamtion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdminPhoneNumber() {
		return adminPhoneNumber;
	}
	public void setAdminPhoneNumber(String adminPhoneNumber) {
		this.adminPhoneNumber = adminPhoneNumber;
	}
	public CompanyEntity getCompany() {
		return company;
	}
	public void setCompany(CompanyEntity company) {
		this.company = company;
	}
	
	

}
