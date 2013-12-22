package com.drt.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.drt.exception.DRTException;
import com.drt.mail.MailService;
import com.drt.service.DRTService;

public class MailServiceTest {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 

		  MailService mailService = (MailService) context.getBean("mailService");
		  DRTService drtService = (DRTService) context.getBean("drtServiceImpl");
		  try {
			drtService.getAllRecords(new Date());
		} catch (DRTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  

		  mailService.sendMail("bharat.teja416@gmail.com", "bharat_teja416@yahoo.com", "Testing123", "Testing only nn Hello Spring Email Sender");

		  

		  mailService.sendAlertMail("Exception occurred");

	}

}
