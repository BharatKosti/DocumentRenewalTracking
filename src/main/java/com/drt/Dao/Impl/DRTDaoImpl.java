package com.drt.Dao.Impl;

import java.util.ArrayList;
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
import com.drt.entity.UserEntity;
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
		@SuppressWarnings("unchecked")
		List<RecordEntity> results = query.list();
		return (RecordEntity) results.get(0);
	}

	public RecordEntity getRecordByDocumentNumber(String documentNumber) throws DRTException{
		Session session = sessionFactory.openSession();
		String sql = "SELECT * FROM Record WHERE documentNumber = :documentNumber";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(RecordEntity.class);
		query.setParameter("documentNumber", documentNumber);
		@SuppressWarnings("unchecked")
		List<RecordEntity> results = query.list();
		return (RecordEntity) results.get(0);
	}

	public List<RecordEntity> getAllRecords() throws DRTException{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from RecordEntity");
		@SuppressWarnings("unchecked")
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
		return "Updated";
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
		@SuppressWarnings("unchecked")
		List<AdminEntity> results = query.list();
		return (AdminEntity) results.get(0);
	}

	public List<AdminEntity> getAllAdmins() throws DRTException{
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from AdminEntity");
		@SuppressWarnings("unchecked")
		List<AdminEntity> adminEntities = query.list();
		return adminEntities;
	}

	public String updateAdmin(AdminEntity adminEntity) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteAdmin(String employeeNumber) throws DRTException{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		AdminEntity adminEntity = (AdminEntity) session.get(AdminEntity.class, employeeNumber);
		session.delete(adminEntity);
		session.getTransaction().commit();
		session.close();
		return "deleted";
	}

	public List<RecordEntity> getAllRecords(Date date) throws DRTException{
		List<RecordEntity> recordEntities = new ArrayList<RecordEntity>();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		session.close();
		return recordEntities;
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
		@SuppressWarnings("unchecked")
		List<CompanyEntity> companyEntities = query.list();
		return companyEntities;
	}

	public String updateCompany(CompanyEntity companyEntity) throws DRTException{
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteCompanyById(int id) throws DRTException{
		return null;
	}

	public CompanyEntity getCompanyByNumber(String companyNumber) throws DRTException{
		String sql = "SELECT * FROM Company WHERE companyNumber = :companyNumber";
		Session session = sessionFactory.openSession();
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(CompanyEntity.class);
		query.setParameter("companyNumber", companyNumber);
		@SuppressWarnings("unchecked")
		List<CompanyEntity> results = query.list();
		return (CompanyEntity) results.get(0);
	}

	public boolean isThereACompany() throws DRTException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.drt.Dao.DRTDao#createUser(com.drt.entity.UserEntity)
	 */
	public String createUser(UserEntity user) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.Dao.DRTDao#getAllUsers()
	 */
	public List<UserEntity> getAllUsers() throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.Dao.DRTDao#getUserBYId(java.lang.String)
	 */
	public UserEntity getUserBYId(String employeeId) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.Dao.DRTDao#updateUser(com.drt.entity.UserEntity)
	 */
	public String updateUser(UserEntity userEntity) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.Dao.DRTDao#deleteUser(com.drt.entity.UserEntity)
	 */
	public String deleteUser(UserEntity userEntity) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.drt.Dao.DRTDao#deleteUserById(java.lang.String)
	 */
	public String deleteUserById(String employeeId) throws DRTException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
