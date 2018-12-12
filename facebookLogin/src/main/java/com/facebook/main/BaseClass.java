package com.facebook.main;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

 public static Properties prop;
 public static WebDriver driver;
	
	public BaseClass() throws IOException{

		prop=new Properties();
		FileInputStream io=new FileInputStream("D:\\SeleniumPageFramework\\facebookLogin\\src\\main\\java\\properties\\config.properties");
		prop.load(io);
		
	}
	
	
	public static void browserstart()
	{
		System.setProperty("webdriver.gecko.driver", "d://java1.8//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(prop.getProperty("url"));
	}
		
}
