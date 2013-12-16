package com.drt.main;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.drt.model.Admin;
import com.drt.model.Record;
import com.drt.service.DRTService;

public class DRTMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DRTService drtService=(DRTService) ctx.getBean("drtServiceImpl");
		Record record = new Record();
		record.setDocumentsHolderName("Bharat");
		record.setDocumentsName("Passport");
		Date expiryDate = new Date();
		record.setExpiryDate(expiryDate );
		//String result=drtService.createRecord(record);
		Admin admin = new Admin();
		drtService.createAdmin(admin);
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
		drtService.updateRecord(record);
		//System.out.println(result);

	}

}
