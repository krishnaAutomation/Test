package com.main.homepagerepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.main.base.parentclass;

public class homepagerepository extends parentclass {

	
	@FindBy(xpath="//input[@id='email']")
	static WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	static WebElement pass;
	
	@FindBy(xpath="//input[@id='u_0_8']")
	static WebElement clickbtn;
	
	public homepagerepository() 
	{
	   PageFactory.initElements(driver, this);
	}
	
	public String getpagetitle()
	{
     return driver.getTitle();
	}
	
	
	public static void loginfunction(String emailid,String password)
	{
	email.sendKeys(emailid);
	pass.sendKeys(password);
	
	}
	
}
