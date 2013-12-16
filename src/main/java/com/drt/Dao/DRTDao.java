/**
 * 
 */
package com.drt.Dao;

import java.util.Date;
import java.util.List;

import com.drt.entity.CompanyEntity;
import com.drt.model.Admin;
import com.drt.model.Record;

/**
 * @author bharatkosti
 *
 */
public interface DRTDao {
	
	public String createRecord(Record record);
	public Record getRecordByEmployeeNumber(String employeeNumber);
	public Record getRecordByDocumentNumber(String documentNumber);
	public List<Record> getAllRecords();
	public String updateRecord(Record record);
	public String deleteRecord(String employeeNumber);
	public String createAdmin(Admin admin);
	public Record getAdminByEmployeeNumber(String employeeNumber);
	public List<Record> getAllAdmins();
	public String updateAdmin(Admin admin);
	public String deleteAdmin(String employeeNumber);
	public List<Record> getAllRecords(Date date);
	public String createCompany(CompanyEntity companyEntity);
	public CompanyEntity getCompanyById(int companyId);
	public List<CompanyEntity> getAllCompany();
	public String updateCompany(CompanyEntity companyEntity);
	public String deleteCompanyById(int id);

}
