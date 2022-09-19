package com.amazon.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.tests.base.DriverScript;

public class FindBeautyAndPersonalCare extends DriverScript{
	
	@FindBy(className = "nav-a  ") WebElement beautyAndPersonalCare;
	
	
	
	public FindBeautyAndPersonalCare() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
     public void clickOnBeautyAndPersonalCare() {
    	 beautyAndPersonalCare.click();  	 
     }
     
     
     
     
     
}