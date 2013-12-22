package com.drt.Dao.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.drt.Dao.DRTDao;
import com.drt.entity.AdminEntity;
import com.drt.entity.CompanyEntity;
import com.drt.entity.RecordEntity;
import com.drt.exception.DRTException;

@Repository
public class DRTDaoImpl implements DRTDao {

	@Autowired
	private SessionFactory sessionFactory;

	public String createRecord(RecordEntity recordEntity) throws DRTException {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(recordEntity);
		session.getTransaction().commit();
		session.close();
		return "Created";
	}

	public RecordEntity getRecordByEmployeeNumber(String employeeNumber) throws DRTException {
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM Record WHERE employeeNumber = :employeeNumber";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(RecordEntity.class);
		query.setParameter("employeeNumber", employeeNumber);
		List results = query.list();
		return (RecordEntity) results.get(0);
	}

	public RecordEntity getRecordByDocumentNumber(String documentNumber) throws DRTException{
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM Record WHERE documentNumber = :documentNumber";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(RecordEntity.class);
		query.setParameter("documentNumber", documentNumber);
		List results = query.list();
		return (RecordEntity) results.get(0);
	}

	public List<RecordEntity> getAllRecords() throws DRTException{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from RecordEntity");
		List<RecordEntity> recordEntities = query.list();
		return recordEntities;
	}

	public String updateRecord(RecordEntity recordEntity) throws DRTException{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		RecordEntity recordEntity1=(RecordEntity) session.get(RecordEntity.class, recordEntity.getEmployeeNumber());
		BeanUtils.copyProperties(recordEntity, recordEntity1);
		session.update(recordEntity1);
		session.getTransaction().commit();
		session.close();
		return null;
	}

	public String deleteRecord(String employeeNumber) throws DRTException{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		RecordEntity recordEntity = (RecordEntity) session.get(RecordEntity.class, employeeNumber);
		session.delete(recordEntity);
		session.getTransaction().commit();
		session.close();
		return "deleted";
	}

	public String createAdmin(AdminEntity adminEntity) throws DRTException{
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(adminEntity);
		session.getTransaction().commit();
		session.close();
		return "Created";
	}

	public AdminEntity getAdminByEmployeeNumber(String employeeNumber) throws DRTException{
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM Admin WHERE employeeNumber = :employeeNumber";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(CompanyEntity.class);
		query.setParameter("emploeeNumber", employeeNumber);
		List results = query.list();
		return (AdminEntity) results.get(0);
	}

	public List<AdminEntity> getAllAdmins() throws DRTException{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from AdminEntity");
		List<AdminEntity> adminEntities = query.list();
		return adminEntities;
	}

	public String updateAdmin(AdminEntity adminEntity) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteAdmin(String employeeNumber) throws DRTException{
		// TODO Auto-generated method stub
		return null;
	}

	public List<RecordEntity> getAllRecords(Date date) throws DRTException{
		// TODO Auto-generated method stub
		return null;
	}

	public String createCompany(CompanyEntity companyEntity) throws DRTException{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(companyEntity);
		session.getTransaction().commit();
		session.close();
		return "Created";
	}

	public CompanyEntity getCompanyById(int companyId) throws DRTException{
		// TODO Auto-generated method stub
		return null;
	}

	public List<CompanyEntity> getAllCompany() throws DRTException{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from CompanyEntity");
		List<CompanyEntity> companyEntities = query.list();
		return companyEntities;
	}

	public String updateCompany(CompanyEntity companyEntity) throws DRTException{
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteCompanyById(int id) throws DRTException{
		// TODO Auto-generated method stub
		return null;
	}

	public CompanyEntity getCompanyByNumber(String companyNumber) throws DRTException{
		String sql = "SELECT * FROM Company WHERE companyNumber = :companyNumber";
		Session session = sessionFactory.openSession();
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(CompanyEntity.class);
		query.setParameter("companyNumber", companyNumber);
		List results = query.list();
		return (CompanyEntity) results.get(0);
	}
	
}
