package com.SauceDemo.TestClasses;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class BaseClass 
{
	WebDriver driver;
    Logger log = Logger.getLogger("SauceDemo");

	@Parameters("browserName")
    @BeforeMethod
	public void setup(String browserName)
	{
		if(browserName.equals("chrome"))
		{	
		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\chromedriver.exe");
		
	   driver = new ChromeDriver();
		System.out.println("Browser is opened");
		}
		else
		{
			System.setProperty("webdriver.gecko.driver",
					"D:\\SELENIUM\\geckodriver.exe");
			
		   driver = new FirefoxDriver();
			System.out.println("Browser is opened");
			
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//login
		
		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
		
		   
		   lp.sendUsername();
		   log.info("Enter user name");
		  
		  
		   lp.Sendpassword();
		   log.info("Enter the pass");

		   
		   lp.clickloginButton();
		   log.info("Click on login");
		   
	} 
    
    
	    @AfterMethod
	   public void tearDown()
	   {
	        //logout
	    	driver.quit();
	       log.info("End of pro");

	      
		
		
	     } 

}
