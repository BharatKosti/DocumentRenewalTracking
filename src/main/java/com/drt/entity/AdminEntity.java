package com.drt.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class AdminEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3955749027534502794L;
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//private int adminId;
	private String adminEntity;
	@Id
	private String employeeNumber;
	private String adminName;
	private String designamtion;
	private String email;
	private String adminPhoneNumber;
	@ManyToOne
	@JoinColumn(name="companyId")
	private CompanyEntity company;
	private String permissions;
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
	
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "AdminEntity [adminEntity=" + adminEntity + ", employeeNumber="
				+ employeeNumber + ", adminName=" + adminName
				+ ", designamtion=" + designamtion + ", email=" + email
				+ ", adminPhoneNumber=" + adminPhoneNumber + ", company="
				+ company + ", permissions=" + permissions + "]";
	}
	
	
	

}
