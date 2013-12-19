package com.drt.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.drt.Dao.DRTDao;
import com.drt.entity.AdminEntity;
import com.drt.entity.CompanyEntity;
import com.drt.entity.RecordEntity;
import com.drt.model.Admin;
import com.drt.model.Company;
import com.drt.model.Record;
import com.drt.service.DRTService;

@Service
@Qualifier("drtServiceImpl")
public class DRTServiceImpl implements DRTService {
	
	@Autowired
	private DRTDao drtDao;

	public String createRecord(Record record) {
		System.out.println("In Service Layer in createRecord");
		RecordEntity recordEntity = new RecordEntity();
		BeanUtils.copyProperties(record, recordEntity);
		String result = drtDao.createRecord(recordEntity);
		return result;
	}

	public Record getRecordByEmployeeNumber(String employeeNumber) {
		System.out.println("In Service Layer in getRecordByEmployeeNumber");
		RecordEntity recordEntity=drtDao.getRecordByEmployeeNumber(employeeNumber);
		Record record = new Record();
		BeanUtils.copyProperties(recordEntity, record);
		return record;
	}

	public Record getRecordByDocumentNumber(String documentNumber) {
		System.out.println("In Service Layer in getRecordByDocumentNumber");
		RecordEntity recordEntity = drtDao.getRecordByDocumentNumber(documentNumber);
		Record record = new Record();
		BeanUtils.copyProperties(recordEntity, record);
		return record;
	}

	public List<Record> getAllRecords() {
		System.out.println("In Service Layer in getAllRecords");
		List<RecordEntity> recordEntities=drtDao.getAllRecords();
		List<Record> records = new ArrayList<Record>();
		for(RecordEntity recordEntity:recordEntities)
		{
			Record record = new Record();
			BeanUtils.copyProperties(recordEntity, record);
			records.add(record);
			
		}
		return records;
	}

	public String updateRecord(Record record) {
		System.out.println("In Service Layer in updateRecord");
		RecordEntity recordEntity = new RecordEntity();
		BeanUtils.copyProperties(record, recordEntity);
		String result = drtDao.updateRecord(recordEntity);
		return result;
	}

	public String deleteRecord(String employeeNumber) {
		System.out.println("In Service Layer in deleteRecord");
		String result = drtDao.deleteRecord(employeeNumber);
		return result;
	}

	public String createAdmin(Admin admin) {
		System.out.println("In Service Layer in createAdmin");
		AdminEntity adminEntity = new AdminEntity();
		BeanUtils.copyProperties(admin, adminEntity);
		String result = drtDao.createAdmin(adminEntity);
		return result;
	}

	public Admin getAdminByEmployeeNumber(String employeeNumber) {
		System.out.println("In Service Layer in getAdminByEmployeeNumber");
		AdminEntity adminEntity =  drtDao.getAdminByEmployeeNumber(employeeNumber);
		Admin admin = new Admin();
		BeanUtils.copyProperties(adminEntity, admin);
		return admin;
	}

	public List<Admin> getAllAdmins() {
		System.out.println("In Service Layer in getAllAdmins");
		List<AdminEntity> adminEntities =  drtDao.getAllAdmins();
		List<Admin> admins = new ArrayList<Admin>();
		for(AdminEntity adminEntity:adminEntities)
		{
			Admin admin = new Admin();
			BeanUtils.copyProperties(adminEntity, admin);
			admins.add(admin);
			
		}
		return admins;
	}

	public String updateAdmin(Admin admin) {
		System.out.println("In Service Layer in updateAdmin");
		AdminEntity adminEntity = new AdminEntity();
		BeanUtils.copyProperties(admin, adminEntity);
		String result =drtDao.updateAdmin(adminEntity);
		return result;
	}

	public String deleteAdmin(String employeeNumber) {
		System.out.println("In Service Layer in deleteAdmin");
		String result =drtDao.deleteAdmin(employeeNumber);
		return result;
	}

	public List<Record> getAllRecords(Date date) {
		List<RecordEntity> recordEntities=drtDao.getAllRecords(date);
		List<Record> records = new ArrayList<Record>();
		for(RecordEntity recordEntity:recordEntities)
		{
			Record record = new Record();
			BeanUtils.copyProperties(recordEntity, record);
			records.add(record);
			
		}
		return records;
	}

	public String createCompany(Company company) {
		CompanyEntity companyEntity = new CompanyEntity();
		BeanUtils.copyProperties(company, companyEntity);
		String result = drtDao.createCompany(companyEntity);
		return result;
	}

	public Company getCompanyById(int companyId) {
		CompanyEntity companyEntity =drtDao.getCompanyById(companyId);
		Company company = new Company();
		BeanUtils.copyProperties(companyEntity, company);
		return company;
	}

	public List<Company> getAllCompany() {
		List<CompanyEntity> companyEntities = drtDao.getAllCompany();
		List<Company> companies = new ArrayList<Company>();
		for(CompanyEntity companyEntity:companyEntities)
		{
			Company company = new Company();
			BeanUtils.copyProperties(companyEntity, company);
			companies.add(company);
			
		}
		return companies;
	}

	public String updateCompany(Company company) {
		CompanyEntity companyEntity = new CompanyEntity();
		BeanUtils.copyProperties(company, companyEntity);
		String result = drtDao.updateCompany(companyEntity);
		return result;
	}

	public String deleteCompanyById(int id) {
		String result = drtDao.deleteCompanyById(id);
		return result;
	}

}
