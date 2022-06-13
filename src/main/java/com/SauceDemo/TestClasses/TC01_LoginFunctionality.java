package com.SauceDemo.TestClasses;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.SauceDemo.POMClasses.HomePagePOMClass;


  
public class TC01_LoginFunctionality extends BaseClass
{
		 //Screenshot
		 
	  @Test	   
	  public void loginFunctionalityTest() 
	  {
		  // ScreenshotClass.screenShot(driver);
		 	
	       String expectedTital = "Swag Labs";
	       String actualTital = driver.getTitle();
	       
	       System.out.println(actualTital);
	       
	       log.info("Verify the test case");
	       
	       Assert.assertEquals(actualTital, expectedTital);
	       
	      
	 
	       
	      //logout
	       
	       HomePagePOMClass hp = new HomePagePOMClass(driver);
	       hp.clickmenubutton();
	       log.info("Click on Menu");
	       
	       hp.clickLogoutButton();
	       log.info("Click on logout");;  
	       
	           
	   }	
	       
	
	
	
}
