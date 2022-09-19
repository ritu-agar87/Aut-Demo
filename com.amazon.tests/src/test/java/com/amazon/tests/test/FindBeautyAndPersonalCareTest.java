package com.amazon.tests.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.test.pages.FindBeautyAndPersonalCare;
import com.amazon.tests.base.DriverScript;

public class FindBeautyAndPersonalCareTest extends DriverScript {
	
	FindBeautyAndPersonalCare findBeautyAndPersonalCare;
	
	@BeforeTest
	public void initializeObject() {
		intiapplication();
	findBeautyAndPersonalCare =new FindBeautyAndPersonalCare();
	
	}
	
	@AfterTest
	public void finalize() {
		quitDriver();
	}

	@Test
	public void testBeautyAndPersonalCare() {
		findBeautyAndPersonalCare.clickOnBeautyAndPersonalCare();
	}
	
}
