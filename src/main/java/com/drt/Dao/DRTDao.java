/**
 * 
 */
package com.drt.Dao;

import java.util.Date;
import java.util.List;

import com.drt.entity.AdminEntity;
import com.drt.entity.CompanyEntity;
import com.drt.entity.RecordEntity;

/**
 * @author bharatkosti
 *
 */
public interface DRTDao {
	
	public String createRecord(RecordEntity record);
	public RecordEntity getRecordByEmployeeNumber(String employeeNumber);
	public RecordEntity getRecordByDocumentNumber(String documentNumber);
	public List<RecordEntity> getAllRecords();
	public String updateRecord(RecordEntity recordEntity);
	public String deleteRecord(String employeeNumber);
	public String createAdmin(AdminEntity adminEntity);
	public AdminEntity getAdminByEmployeeNumber(String employeeNumber);
	public List<AdminEntity> getAllAdmins();
	public String updateAdmin(AdminEntity adminEntity);
	public String deleteAdmin(String employeeNumber);
	public List<RecordEntity> getAllRecords(Date date);
	public String createCompany(CompanyEntity companyEntity);
	public CompanyEntity getCompanyById(int companyId);
	public List<CompanyEntity> getAllCompany();
	public String updateCompany(CompanyEntity companyEntity);
	public String deleteCompanyById(int id);

}
