package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;


public class TC02_logoutFunctionality extends BaseClass
{
	
	  
	  @Test
	   public void logOutFunctionality()
	   {
	 
	   //homepage
	  
	 
	   HomePagePOMClass hp = new HomePagePOMClass(driver);
	   hp.clickmenubutton();
	   System.out.println("click menu button");
	   
	  

	   hp.clickLogoutButton();
	   System.out.println("click logout button");
	   
	   

		
      String expectedUrl = "https://www.saucedemo.com/";
      String actualUrl = driver.getCurrentUrl();
//       
//       Assert.assertEquals(actualUrl, expectedUrl);
      
       
       
       
   }
	   
	   
}
