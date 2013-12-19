package com.drt.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.drt.entity.CompanyEntity;
import com.drt.model.Admin;
import com.drt.model.Company;
import com.drt.model.Record;
import com.drt.service.DRTService;

public class DRTMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DRTService drtService=(DRTService) ctx.getBean("drtServiceImpl");
		Company company = new Company();
		company.setCompanyNumber("CMP1");
		company.setName("COMPANY");
		//String result = drtService.createCompany(company);
		//System.out.println(result);
		Record record = new Record();
		record.setDocumentsHolderName("Bharat");
		record.setDocumentsName("Passport");
		record.setDocumentNumber("ALP123456789");
		record.setEmployeeNumber("u298662");
		Calendar expiryDate = new GregorianCalendar(2013, 12, 19);
		record.setExpiryDate(expiryDate);
		Calendar issueDate = new GregorianCalendar(2012, 12, 19);
		record.setIssueDate(issueDate);
		String email = new String("bharat.teja416@gmail.com");
		String email1 = new String("bharat_teja416@yahoo.com");
		List<String> emailList = new ArrayList<String>();
		emailList.add(email);
		emailList.add(email1);
		record.setEmail(emailList);
		String phoneNumber = new String("1234567890");
		String phoneNumber1 = new String("0987654321");
		List<String> phoneNumbers = new ArrayList<String>();
		phoneNumbers.add(phoneNumber);
		phoneNumbers.add(phoneNumber1);
		record.setPhoneNumber(phoneNumbers);
		record.setCompanyNumber("CMP1");
		//drtService.createRecord(record);
		System.out.println(drtService.getAllRecords().get(0).getEmployeeNumber());
		Admin admin = new Admin();
		/*drtService.createAdmin(admin);
		String employeeNumber = new String();
		drtService.deleteAdmin(employeeNumber);
		drtService.deleteRecord(employeeNumber);
		drtService.getAdminByEmployeeNumber(employeeNumber);
		drtService.getAllAdmins();
		drtService.getAllRecords();
		String documentNumber= new String();
		drtService.getRecordByDocumentNumber(documentNumber);
		drtService.getRecordByEmployeeNumber(employeeNumber);
		drtService.updateAdmin(admin);
		drtService.updateRecord(record);*/
		//System.out.println(result);

	}

}
