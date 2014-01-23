/**
 * 
 */
package com.drt.Dao;

import java.util.Date;
import java.util.List;

import com.drt.entity.AdminEntity;
import com.drt.entity.CompanyEntity;
import com.drt.entity.RecordEntity;
import com.drt.entity.UserEntity;
import com.drt.exception.DRTException;
import com.drt.model.User;

/**
 * @author bharatkosti
 *
 */
public interface DRTDao {
	
	public String createRecord(RecordEntity record) throws DRTException;
	public RecordEntity getRecordByEmployeeNumber(String employeeNumber) throws DRTException;
	public RecordEntity getRecordByDocumentNumber(String documentNumber) throws DRTException;
	public List<RecordEntity> getAllRecords() throws DRTException;
	public String updateRecord(RecordEntity recordEntity) throws DRTException;
	public String deleteRecord(String employeeNumber) throws DRTException;
	public String createAdmin(AdminEntity adminEntity) throws DRTException;
	public AdminEntity getAdminByEmployeeNumber(String employeeNumber) throws DRTException;
	public List<AdminEntity> getAllAdmins() throws DRTException;
	public String updateAdmin(AdminEntity adminEntity) throws DRTException;
	public String deleteAdmin(String employeeNumber) throws DRTException;
	public List<RecordEntity> getAllRecords(Date date) throws DRTException;
	public String createCompany(CompanyEntity companyEntity) throws DRTException;
	public CompanyEntity getCompanyById(int companyId) throws DRTException;
	public CompanyEntity getCompanyByNumber(String companyNumber) throws DRTException;
	public List<CompanyEntity> getAllCompany() throws DRTException;
	public String updateCompany(CompanyEntity companyEntity) throws DRTException;
	public String deleteCompanyById(int id) throws DRTException;
	public boolean isThereACompany() throws DRTException;
	public String createUser(UserEntity user) throws DRTException;
	public List<UserEntity> getAllUsers() throws DRTException;
	public UserEntity getUserBYId(String employeeId) throws DRTException;
	public String updateUser(UserEntity userEntity) throws DRTException;
	public String deleteUser(UserEntity userEntity) throws DRTException;
	public String deleteUserById(String employeeId) throws DRTException;

}
