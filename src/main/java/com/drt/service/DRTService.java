package com.drt.service;

import java.util.Date;
import java.util.List;

import com.drt.model.Admin;
import com.drt.model.Company;
import com.drt.model.Record;

public interface DRTService {
	
	public String createRecord(Record record);
	public Record getRecordByEmployeeNumber(String employeeNumber);
	public Record getRecordByDocumentNumber(String documentNumber);
	public List<Record> getAllRecords();
	public String updateRecord(Record record);
	public String deleteRecord(String employeeNumber);
	public String createAdmin(Admin admin);
	public Admin getAdminByEmployeeNumber(String employeeNumber);
	public List<Admin> getAllAdmins();
	public String updateAdmin(Admin admin);
	public String deleteAdmin(String employeeNumber);
	public List<Record> getAllRecords(Date date);
	public String createCompany(Company company);
	public Company getCompanyById(int companyId);
	public List<Company> getAllCompany();
	public String updateCompany(Company company);
	public String deleteCompanyById(int id);

}
