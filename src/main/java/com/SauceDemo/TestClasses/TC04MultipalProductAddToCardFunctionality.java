package com.SauceDemo.TestClasses;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;

public class TC04MultipalProductAddToCardFunctionality extends BaseClass 
{
     
	 
	     @Test
	      public void loginFunctionalityTest() throws IOException
	       {
			   //select all product
			   
			   HomePagePOMClass hp = new HomePagePOMClass(driver);
			   hp.addAllProduct();
			   log.info("All prod are add to card");
			   
			   
			   ScreenshotClass.takesscreenShot(driver);
			  log.info("screenshot is taken");
			   
				//validation
			   
	           log.info("apply validation");
	   
	            String actualResult =hp.getTextFromCartButton();
	            String expectedResult = "3";
	            
	            Assert.assertEquals(actualResult, expectedResult);
	            log.info("Test is pass");
	            
	                       
	            hp.clickmenubutton();
	            log.info("click on menu ");
	            
	            hp.clickLogoutButton();
	            log.info("click on logout");
	            
	       }          
	   
	  
	
}
