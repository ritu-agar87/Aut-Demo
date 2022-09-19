package com.amazon.tests.base;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverScript {

	
	public static WebDriver driver;
	Properties prop;
	
	public DriverScript()
	{
		try
		{
			File src = new File("./config/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("unable to load the properties file please check "+e.getMessage());
		}
	}
	
	public void intiapplication() {
		
String browser = prop.getProperty("browsers");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.err.println("please provide valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		launchURL();
		//quitDriver();
		

	}
	
	public void launchURL()
	{
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	public static void quitDriver()
	{
		driver.quit();
	}
}
