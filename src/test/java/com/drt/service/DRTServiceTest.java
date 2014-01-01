/**
 * 
 */
package com.drt.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.drt.exception.DRTException;
import com.drt.model.Company;
import com.drt.model.Record;

/**
 * @author bharatkosti
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DRTServiceTest {

	@Autowired
	private DRTService drtServiceImpl;
	@Ignore
	@Test
	public void getAllCompanyTest() {
		try {
			List<Company> companies= drtServiceImpl.getAllCompany();
			System.out.println(companies.get(0));
		} catch (DRTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fail("Not yet implemented");
	}
	
	@Test
	public void getAllRecordsTest()
	{
		try {
			List<Record> records = drtServiceImpl.getAllRecords();
			System.out.println(records);
		} catch (DRTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
