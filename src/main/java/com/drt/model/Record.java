package com.drt.model;

import java.util.Date;
import java.util.List;

public class Record {
	
	private String documentsName;
	private String documentsHolderName;
	private String documentNumber;
	private String employeeNumber;
	private Date issueDate;
	private Date expiryDate;
	private List<String> phoneNumber;
	private List<String> email;
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
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	
	

}
