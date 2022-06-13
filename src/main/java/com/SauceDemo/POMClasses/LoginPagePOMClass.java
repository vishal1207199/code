package com.SauceDemo.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPagePOMClass 
{
    //WebElement find
	//action on WebElement
	
	private WebDriver driver;
	
	//We will not use this
//	WebElement userName  = driver.findElement(By.xpath("-----"));
//	userName.findElement("Standart user")
	
	//annotations--@--method only functionality
	//selenium import
	
	//find the element by @FindBy
	//username
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
		
	//Action on element method
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	//pass
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void Sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	//login
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	public void clickloginButton()
	{
       loginButton.click();
	}
	
	
	// constructor declare
	
	public LoginPagePOMClass(WebDriver driver)
	{
		//global = local
		this.driver = driver;
		
		
		//selenum class
		
		PageFactory.initElements(driver, this);
		
		
	}
	
//	1.Webdriver driver;  global
//	2.element find---> @FindBy
//	3.Method ---> element action
//	4.constructor---> thi and pageFactory
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
