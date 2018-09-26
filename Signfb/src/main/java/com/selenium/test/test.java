package com.selenium.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test {

	
    
	@Test
	public void browser()
	{
    	System.setProperty("webdriver.gecko.driver", "D://java1.8//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
		//
    	 
    	
	
    
    
}