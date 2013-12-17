package com.drt.Dao.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.drt.Dao.DRTDao;
import com.drt.entity.AdminEntity;
import com.drt.entity.CompanyEntity;
import com.drt.entity.RecordEntity;

@Repository
public class DRTDaoImpl implements DRTDao {

	@Autowired
	private SessionFactory sessionFactory;

	public String createRecord(RecordEntity recordEntity) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(recordEntity);
		session.getTransaction().commit();
		session.close();
		return "Created";
	}

	public RecordEntity getRecordByEmployeeNumber(String employeeNumber) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		return null;
	}

	public RecordEntity getRecordByDocumentNumber(String documentNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RecordEntity> getAllRecords() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//session.get(RecordEntity.class)
		return null;
	}

	public String updateRecord(RecordEntity recordEntity) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		RecordEntity recordEntity1=(RecordEntity) session.get(RecordEntity.class, recordEntity.getEmployeeNumber());
		BeanUtils.copyProperties(recordEntity, recordEntity1);
		session.update(recordEntity1);
		session.getTransaction().commit();
		session.close();
		return null;
	}

	public String deleteRecord(String employeeNumber) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		RecordEntity recordEntity = (RecordEntity) session.get(RecordEntity.class, employeeNumber);
		session.delete(recordEntity);
		session.getTransaction().commit();
		session.close();
		return "deleted";
	}

	public String createAdmin(AdminEntity adminEntity) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(adminEntity);
		session.getTransaction().commit();
		session.close();
		return "Created";
	}

	public AdminEntity getAdminByEmployeeNumber(String employeeNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AdminEntity> getAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateAdmin(AdminEntity adminEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteAdmin(String employeeNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RecordEntity> getAllRecords(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	public String createCompany(CompanyEntity companyEntity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(companyEntity);
		session.getTransaction().commit();
		session.close();
		return "Created";
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
