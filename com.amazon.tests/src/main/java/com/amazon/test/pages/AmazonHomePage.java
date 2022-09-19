package com.amazon.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.tests.base.DriverScript;
public class AmazonHomePage extends DriverScript {

    @FindBy(id = "twotabsearchtextbox") WebElement searchBox;
    
    @FindBy(id = "nav-search-submit-button") WebElement submitButton;
    
    @FindBy(className = "a-size-medium a-color-base a-text-normal") WebElement bagLink;
	


    public AmazonHomePage() {
	    PageFactory.initElements(driver, this);
     }

    public String getTitle() {
	    return driver.getTitle();
     }
    
    public void enterTextInSearchBox(String productName) {
    	searchBox.sendKeys(productName);
    }
     
    public void clickOnSubmitButton() {
    	submitButton.click();
    }
	
    
	}

	
	

