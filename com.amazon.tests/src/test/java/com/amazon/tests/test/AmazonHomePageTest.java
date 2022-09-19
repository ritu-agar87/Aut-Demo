package com.amazon.tests.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.test.pages.AmazonHomePage;
import com.amazon.test.pages.AmazonSearchResultPage;
import com.amazon.tests.base.DriverScript;


public class AmazonHomePageTest extends DriverScript{
	
	AmazonHomePage amazonHomePage;
	AmazonSearchResultPage amazonSearchResultPage;
	
	@BeforeTest
	public void initializeObject() {
		intiapplication();
		amazonHomePage = new AmazonHomePage();
		amazonSearchResultPage = new AmazonSearchResultPage();
	}
	
	@AfterTest
	public void tearDown() {
		quitDriver();
	}
	
	@Test (priority = 1)
	public void testTitle() {
		Assert.assertEquals("Amazon.com. Spend less. Smile more.", amazonHomePage.getTitle());
	}
	
	@Test (priority = 2)
	
	public void testSearchBox()
	{
		amazonHomePage.enterTextInSearchBox("School Bag");
	}
	
	@Test (priority=3)
	public void testSubmitButton() {
		
	amazonHomePage.clickOnSubmitButton();	
	}
	
	@Test (priority = 4)
	public void testSchoolBagLink() {
		amazonSearchResultPage.clickOnSchoolBagLinkBasedOnIndex(2);
	}
	
	
	
}