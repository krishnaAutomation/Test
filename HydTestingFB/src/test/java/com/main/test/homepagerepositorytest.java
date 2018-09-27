package com.main.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.base.parentclass;
import com.main.homepagerepo.homepagerepository;

public class homepagerepositorytest extends parentclass {

	homepagerepository t;
	
	public homepagerepositorytest()
	{
		super();
		
	}
	
    @BeforeMethod
    public void startTest()
    {
    	browserlaunch();
    }
    
    @Test(priority=1)
	public void loginfn()
	{
	    t=new homepagerepository();
		t.loginfunction(p.getProperty("user"), p.getProperty("pass"));
	}
	
    @Test(priority=2)
    public void gettitle()
    {
    String title=t.getpagetitle();
     Assert.assertEquals(title, "Facebook – log in or sign up");  	
    }
    
    
    
	@AfterMethod
	public void endTest()
	{
		driver.close();
	}
	
}
