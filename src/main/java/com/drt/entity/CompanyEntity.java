package com.drt.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class CompanyEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5869006593381382990L;
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//private int companyId;
	private String name;
	private String email;
	private String emailPassword;
	@Id
	private String companyNumber;
	@OneToMany(mappedBy="company")
	private List<RecordEntity> recordList;
	@OneToMany(mappedBy="company")
	private List<AdminEntity> adminList;
	@OneToMany(mappedBy="company")
	private List<UserEntity> userList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailPassword() {
		return emailPassword;
	}
	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}
	public List<RecordEntity> getRecordList() {
		return recordList;
	}
	public void setRecordList(List<RecordEntity> recordList) {
		this.recordList = recordList;
	}
	public List<AdminEntity> getAdminList() {
		return adminList;
	}
	public void setAdminList(List<AdminEntity> adminList) {
		this.adminList = adminList;
	}
	public String getCompanyNumber() {
		return companyNumber;
	}
	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}
	public List<UserEntity> getUserList() {
		return userList;
	}
	public void setUserList(List<UserEntity> userList) {
		this.userList = userList;
	}
	@Override
	public String toString() {
		return "CompanyEntity [name=" + name + ", email=" + email
				+ ", emailPassword=" + emailPassword + ", companyNumber="
				+ companyNumber + ", recordList=" + recordList + ", adminList="
				+ adminList + ", userList=" + userList + "]";
	}
	
	
	
	
	
	
}
