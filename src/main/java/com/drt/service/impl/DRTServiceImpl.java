package com.drt.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.drt.Dao.DRTDao;
import com.drt.model.Admin;
import com.drt.model.Record;
import com.drt.service.DRTService;

@Service
@Qualifier("drtServiceImpl")
public class DRTServiceImpl implements DRTService {
	
	@Autowired
	private DRTDao drtDao;

	public String createRecord(Record record) {
		System.out.println("In Service Layer in createRecord");
		drtDao.createRecord(record);
		return "Created";
	}

	public Record getRecordByEmployeeNumber(String employeeNumber) {
		System.out.println("In Service Layer in getRecordByEmployeeNumber");
		drtDao.getRecordByEmployeeNumber(employeeNumber);
		return null;
	}

	public Record getRecordByDocumentNumber(String documentNumber) {
		System.out.println("In Service Layer in getRecordByDocumentNumber");
		drtDao.getRecordByDocumentNumber(documentNumber);
		return null;
	}

	public List<Record> getAllRecords() {
		System.out.println("In Service Layer in getAllRecords");
		drtDao.getAllRecords();
		return null;
	}

	public String updateRecord(Record record) {
		System.out.println("In Service Layer in updateRecord");
		drtDao.updateRecord(record);
		return null;
	}

	public String deleteRecord(String employeeNumber) {
		System.out.println("In Service Layer in deleteRecord");
		drtDao.deleteRecord(employeeNumber);
		return null;
	}

	public String createAdmin(Admin admin) {
		System.out.println("In Service Layer in createAdmin");
		drtDao.createAdmin(admin);
		return null;
	}

	public Record getAdminByEmployeeNumber(String employeeNumber) {
		System.out.println("In Service Layer in getAdminByEmployeeNumber");
		drtDao.getAdminByEmployeeNumber(employeeNumber);
		return null;
	}

	public List<Record> getAllAdmins() {
		System.out.println("In Service Layer in getAllAdmins");
		drtDao.getAllAdmins();
		return null;
	}

	public String updateAdmin(Admin admin) {
		System.out.println("In Service Layer in updateAdmin");
		drtDao.updateAdmin(admin);
		return null;
	}

	public String deleteAdmin(String employeeNumber) {
		System.out.println("In Service Layer in deleteAdmin");
		drtDao.deleteAdmin(employeeNumber);
		return null;
	}

	public List<Record> getAllRecords(Date date) {
		drtDao.getAllRecords(date);
		return null;
	}

}
