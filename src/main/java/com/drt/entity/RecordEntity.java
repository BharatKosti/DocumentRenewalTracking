package com.drt.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Record")
public class RecordEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1696242652877102839L;
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//private int recordId;
	private String documentsName;
	private String documentsHolderName;
	@Id
	private String documentNumber;
	@Id
	private String employeeNumber;
	private Date issueDate;
	private Date expiryDate;
	private String phoneNumber;
	private String email;
	@ManyToOne
	@JoinColumn(name="companyId")
	private CompanyEntity company;
	
	
	public String getDocumentsName() {
		return documentsName;
	}
	public void setDocumentsName(String documentsName) {
		this.documentsName = documentsName;
	}
	public String getDocumentsHolderName() {
		return documentsHolderName;
	}
	public void setDocumentsHolderName(String documentsHolderName) {
		this.documentsHolderName = documentsHolderName;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CompanyEntity getCompany() {
		return company;
	}
	public void setCompany(CompanyEntity company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "RecordEntity [documentsName=" + documentsName
				+ ", documentsHolderName=" + documentsHolderName
				+ ", documentNumber=" + documentNumber + ", employeeNumber="
				+ employeeNumber + ", issueDate=" + issueDate + ", expiryDate="
				+ expiryDate + ", phoneNumber=" + phoneNumber + ", email="
				+ email + "]";
	}
	
	
	
	
	

}
