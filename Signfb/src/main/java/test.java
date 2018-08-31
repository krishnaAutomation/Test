import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test {

	
    public static void main(String[] args) {
    
    	
    	
    	System.setProperty("webdriver.gecko.driver", "D://java1.8//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
    
		
		WebElement name=driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")); 
		
		WebElement surname=driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
		
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"u_0_v\"]"));
		
	    Select dropdownday=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	    		
	    Select dropdownmonth=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	   		
	    Select dropdownyear=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	    
	    WebElement sex=driver.findElement(By.xpath("//*[@id=\"u_0_9\"]"));
		
	    WebElement signup=driver.findElement(By.xpath("//*[@id=\"u_0_11\"]"));
	    
    		   name.sendKeys("krishna");
    		   surname.sendKeys("singh");
    		   mobile.sendKeys("9876789876");
    		   password.sendKeys("jiji");
    		   dropdownday.selectByIndex(3);
    		   dropdownmonth.selectByIndex(4);
    		   dropdownyear.selectByIndex(6);
    		   sex.click();
    		   signup.click();
    	 
    	
	}
    
    
}