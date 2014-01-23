package com.drt.service;

import java.util.Date;
import java.util.List;

import com.drt.exception.DRTException;
import com.drt.model.Admin;
import com.drt.model.Company;
import com.drt.model.Record;
import com.drt.model.User;

public interface DRTService {
	
	public String createRecord(Record record) throws DRTException;
	public Record getRecordByEmployeeNumber(String employeeNumber) throws DRTException;
	public Record getRecordByDocumentNumber(String documentNumber) throws DRTException;
	public List<Record> getAllRecords() throws DRTException;
	public String updateRecord(Record record) throws DRTException;
	public String deleteRecord(String employeeNumber) throws DRTException;
	public String createAdmin(Admin admin) throws DRTException;
	public Admin getAdminByEmployeeNumber(String employeeNumber) throws DRTException;
	public List<Admin> getAllAdmins() throws DRTException;
	public String updateAdmin(Admin admin) throws DRTException;
	public String deleteAdmin(String employeeNumber) throws DRTException;
	public List<Record> getAllRecords(Date date) throws DRTException;
	public String createCompany(Company company) throws DRTException;
	public Company getCompanyById(int companyId) throws DRTException;
	public List<Company> getAllCompany() throws DRTException;
	public String updateCompany(Company company) throws DRTException;
	public String deleteCompanyById(int id) throws DRTException;
	public boolean isThereACompany() throws DRTException;
	public String createUser(User user) throws DRTException;
	public List<User> getAllUsers() throws DRTException;
	public User getUserBYId(String employeeId) throws DRTException;
	public String updateUser(User user) throws DRTException;
	public String deleteUser(User user) throws DRTException;
	public String deleteUserById(String employeeId) throws DRTException;
}
