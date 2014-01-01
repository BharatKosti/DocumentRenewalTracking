package com.drt.model;

public class Company {
	
	private String name;
	private String email;
	private String emailPassword;
	private String companyNumber;
	
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
	public String getCompanyNumber() {
		return companyNumber;
	}
	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", email=" + email
				+ ", emailPassword=" + emailPassword + ", companyNumber="
				+ companyNumber + "]";
	}
}
