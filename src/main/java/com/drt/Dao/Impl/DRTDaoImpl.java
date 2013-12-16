package com.drt.Dao.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.drt.Dao.DRTDao;
import com.drt.entity.CompanyEntity;
import com.drt.entity.RecordEntity;
import com.drt.model.Admin;
import com.drt.model.Record;

@Repository
public class DRTDaoImpl implements DRTDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public String createRecord(Record record) {
		System.out.println("In DAO Layer in createRecord");
		Session session = sessionFactory.openSession();
		RecordEntity recordEntity = new RecordEntity();
		recordEntity.setDocumentsHolderName(record.getDocumentsHolderName());
		recordEntity.setDocumentsName(record.getDocumentsName());
		session.save(recordEntity);
		session.close();
		return "Created";
	}

	public Record getRecordByEmployeeNumber(String employeeNumber) {
		System.out.println("In DAO Layer in getRecordByEmployeeNumber");
		return null;
	}

	public Record getRecordByDocumentNumber(String documentNumber) {
		System.out.println("In DAO Layer in getRecordByDocumentNumber");
		return null;
	}

	public List<Record> getAllRecords() {
		System.out.println("In DAO Layer in getAllRecords");
		return null;
	}

	public String updateRecord(Record record) {
		System.out.println("In DAO Layer in updateRecord");
		return null;
	}

	public String deleteRecord(String employeeNumber) {
		System.out.println("In DAO Layer in deleteRecord");
		return null;
	}

	public String createAdmin(Admin admin) {
		System.out.println("In DAO Layer in createAdmin");
		return null;
	}

	public Record getAdminByEmployeeNumber(String employeeNumber) {
		System.out.println("In DAO Layer in getAdminByEmployeeNumber");
		return null;
	}

	public List<Record> getAllAdmins() {
		System.out.println("In DAO Layer in getAllAdmins");
		return null;
	}

	public String updateAdmin(Admin admin) {
		System.out.println("In DAO Layer in updateAdmin");
		return null;
	}

	public String deleteAdmin(String employeeNumber) {
		System.out.println("In DAO Layer in deleteAdmin");
		return null;
	}

	public List<Record> getAllRecords(Date date) {
		System.out.println(date);
		return null;
	}

	public String createCompany(CompanyEntity companyEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	public CompanyEntity getCompanyById(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyEntity> getAllCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateCompany(CompanyEntity companyEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteCompanyById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
