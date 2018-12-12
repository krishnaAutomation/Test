package com.facebook.test;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.facebook.main.BaseClass;
import com.facebook.main.homeloginrepository;


public class test extends BaseClass {

	
    test() throws IOException {
		super();
		browserstart();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod 
	public void loginfn() throws IOException
	{
		homeloginrepository hlr=new homeloginrepository();
		hlr.loginfunction(prop.getProperty("id"), prop.getProperty("pass"));
	}
	
    @Test(priority=1)
    public void gettitle() throws IOException
    {
    homeloginrepository hlr=new homeloginrepository();
    String title=hlr.getpagetitle();
    Assert.assertEquals(title, "Facebook – log in or sign up");  	
    }
    
    
	@AfterMethod
	public void endTest() throws InterruptedException
	{
		driver.close();
	}
	
}