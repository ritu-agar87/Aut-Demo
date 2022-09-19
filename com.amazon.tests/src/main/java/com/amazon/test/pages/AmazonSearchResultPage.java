package com.amazon.test.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.tests.base.DriverScript;

public class AmazonSearchResultPage extends DriverScript{
	
	@FindBy(xpath = "//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']") List<WebElement> schoolBagLinkList;
	
	public AmazonSearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSchoolBagLinkBasedOnIndex(int index) {
		schoolBagLinkList.get(index).click();
	}
	

}
