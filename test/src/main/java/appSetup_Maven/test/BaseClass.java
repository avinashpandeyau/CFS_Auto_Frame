package appSetup_Maven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	

  protected WebDriver driver =null;
	 
	
	public void setupApplication()
	{
		
		Reporter.log("=====Browser Session Started=====", true);
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
                driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://preprod.cloudfilesync.com");
		
		Reporter.log("=====Application Started=====", true);
	}
	

	public void closeApplication()
	{
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
	}
	
	public void getUrl() {
		driver.get("http://preprod.cloudfilesync.com");
	}
	
	public void login() {
		driver.get("http://preprod.cloudfilesync.com");
	}
	
	
}