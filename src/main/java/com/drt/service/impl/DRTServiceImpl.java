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
import com.drt.exception.DRTException;
import com.drt.model.Admin;
import com.drt.model.Company;
import com.drt.model.Record;
import com.drt.model.User;
import com.drt.service.DRTService;

@Service
@Qualifier("drtServiceImpl")
public class DRTServiceImpl implements DRTService {
	
	@Autowired
	private DRTDao drtDao;
	private static String[] ignoreProperties = {"issueDate","expiryDate","phoneNumber","email"}; 
	public String createRecord(Record record) throws DRTException {
		System.out.println("In Service Layer in createRecord");
		RecordEntity recordEntity = new RecordEntity();
		BeanUtils.copyProperties(record, recordEntity,ignoreProperties);
		CompanyEntity companyEntity = drtDao.getCompanyByNumber(record.getCompanyNumber());
		System.out.println(companyEntity);
		if(record.getPhoneNumber()!=null)
		recordEntity.setPhoneNumber(record.getPhoneNumber().get(0));
		if(record.getEmail()!=null)
		recordEntity.setEmail(record.getEmail().get(0));
		if(record.getExpiryDate()!=null)
		{
			java.sql.Date expiryDate = new java.sql.Date(record.getExpiryDate().getTimeInMillis());
			System.out.println(expiryDate);
			recordEntity.setExpiryDate(expiryDate);
			java.sql.Date issueDate = new java.sql.Date(record.getIssueDate().getTimeInMillis());
			recordEntity.setIssueDate(issueDate);
		}
		
		recordEntity.setCompany(companyEntity);
		String result = drtDao.createRecord(recordEntity);
		return result;
	}

	public Record getRecordByEmployeeNumber(String employeeNumber) throws DRTException {
		System.out.println("In Service Layer in getRecordByEmployeeNumber");
		RecordEntity recordEntity=drtDao.getRecordByEmployeeNumber(employeeNumber);
		Record record = new Record();
		BeanUtils.copyProperties(recordEntity, record,ignoreProperties);
		return record;
	}

	public Record getRecordByDocumentNumber(String documentNumber) throws DRTException {
		System.out.println("In Service Layer in getRecordByDocumentNumber");
		RecordEntity recordEntity = drtDao.getRecordByDocumentNumber(documentNumber);
		Record record = new Record();
		BeanUtils.copyProperties(recordEntity, record,ignoreProperties);
		return record;
	}

	public List<Record> getAllRecords() throws DRTException {
		System.out.println("In Service Layer in getAllRecords");
		List<RecordEntity> recordEntities=drtDao.getAllRecords();
		List<Record> records = new ArrayList<Record>();
		for(RecordEntity recordEntity:recordEntities)
		{
			Record record = new Record();
			BeanUtils.copyProperties(recordEntity, record,ignoreProperties);
			records.add(record);
			
		}
		return records;
	}

	public String updateRecord(Record record) throws DRTException {
		System.out.println("In Service Layer in updateRecord");
		RecordEntity recordEntity = new RecordEntity();
		BeanUtils.copyProperties(record, recordEntity);
		String result = drtDao.updateRecord(recordEntity);
		return result;
	}

	public String deleteRecord(String employeeNumber) throws DRTException {
		System.out.println("In Service Layer in deleteRecord");
		String result = drtDao.deleteRecord(employeeNumber);
		return result;
	}

	public String createAdmin(Admin admin) throws DRTException {
		System.out.println("In Service Layer in createAdmin");
		AdminEntity adminEntity = new AdminEntity();
		BeanUtils.copyProperties(admin, adminEntity);
		String result = drtDao.createAdmin(adminEntity);
		return result;
	}

	public Admin getAdminByEmployeeNumber(String employeeNumber) throws DRTException {
		System.out.println("In Service Layer in getAdminByEmployeeNumber");
		AdminEntity adminEntity =  drtDao.getAdminByEmployeeNumber(employeeNumber);
		Admin admin = new Admin();
		BeanUtils.copyProperties(adminEntity, admin);
		return admin;
	}

	public List<Admin> getAllAdmins() throws DRTException {
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

	public String updateAdmin(Admin admin) throws DRTException {
		System.out.println("In Service Layer in updateAdmin");
		AdminEntity adminEntity = new AdminEntity();
		BeanUtils.copyProperties(admin, adminEntity);
		String result =drtDao.updateAdmin(adminEntity);
		return result;
	}

	public String deleteAdmin(String employeeNumber) throws DRTException {
		System.out.println("In Service Layer in deleteAdmin");
		String result =drtDao.deleteAdmin(employeeNumber);
		return result;
	}

	public List<Record> getAllRecords(Date date) throws DRTException {
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

	public String createCompany(Company company) throws DRTException {
		CompanyEntity companyEntity = new CompanyEntity();
		BeanUtils.copyProperties(company, companyEntity);
		String result = drtDao.createCompany(companyEntity);
		return result;
	}

	public Company getCompanyById(int companyId) throws DRTException {
		CompanyEntity companyEntity =drtDao.getCompanyById(companyId);
		Company company = new Company();
		BeanUtils.copyProperties(companyEntity, company);
		return company;
	}

	public List<Company> getAllCompany() throws DRTException {
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

	public String updateCompany(Company company) throws DRTException {
		CompanyEntity companyEntity = new CompanyEntity();
		BeanUtils.copyProperties(company, companyEntity);
		String result = drtDao.updateCompany(companyEntity);
		return result;
	}

	public String deleteCompanyById(int id) throws DRTException {
		String result = drtDao.deleteCompanyById(id);
		return result;
	}

	public boolean isThereACompany() throws DRTException {
			boolean result = drtDao.isThereACompany();
		return result;
	}

	/* (non-Javadoc)
	 * @see com.drt.service.DRTService#createUser(com.drt.model.User)
	 */
	public String createUser(User user) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.service.DRTService#getAllUsers()
	 */
	public List<User> getAllUsers() throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.service.DRTService#getUserBYId(java.lang.String)
	 */
	public User getUserBYId(String employeeId) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.service.DRTService#updateUser(com.drt.model.User)
	 */
	public String updateUser(User user) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.service.DRTService#deleteUser(com.drt.model.User)
	 */
	public String deleteUser(User user) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.service.DRTService#deleteUserById(java.lang.String)
	 */
	public String deleteUserById(String employeeId) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
