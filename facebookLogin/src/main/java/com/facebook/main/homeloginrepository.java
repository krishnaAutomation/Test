package com.facebook.main;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeloginrepository extends BaseClass {

	
	@FindBy(xpath="//input[@id='email']")
	static WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
 	static WebElement password;
	
	@FindBy(xpath="//input[@id='u_0_2']")
	static
	WebElement enter;
	
	public homeloginrepository() throws IOException {
	
		PageFactory.initElements(driver, this);
		
	}

	public String getpagetitle()
	{
     return driver.getTitle();
	}
	
	
	public static void loginfunction(String username1,String password1)
	{
	username.sendKeys(username1);
	password.sendKeys(password1);
    enter.click();	
	}
	
}
