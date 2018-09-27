package com.main.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.sql.rowset.WebRowSet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parentclass {

 public static	WebDriver driver;
 public static Properties p;	
 
	public parentclass() {
		// TODO Auto-generated constructor stub
		p=new Properties();
		try {
			FileInputStream io=new FileInputStream("D:\\photon\\HydTestingFB\\src\\main\\java\\com\\main\\properties\\config.properties");
			p.load(io);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void browserlaunch()
	{
		String browser=p.getProperty("browser");
		
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "d://java1.8//geckodriver.exe");
	        driver=new FirefoxDriver();    		
	        driver.get(p.getProperty("url"));
		}
	}
	
}
