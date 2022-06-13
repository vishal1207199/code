package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{
	//WebElement find
		//action on Webelement
		//annotations--@--method only functionality
		//selenium import
	
	//WebDriver decleared
	private WebDriver driver;
	
	
	//backpack Element selection @FindBy
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack'] ")
	private WebElement backpack;
	
	public void selectBackpack()
	{
		backpack.click();
	}
	
	
//	//bike light
//	
//	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
//	private WebElement bikelight;
//	
//	public void selectBikelight()
//	{
//		bikelight.click();
//	}
//	
//	//bolt t-shirt
//	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
//	private WebElement bolttshirt;
//	
//	public void selectBolttshirt()
//	{
//		bolttshirt.click();
//	}
//	
//	
//	//addtocart
//	
//	@FindBy(xpath="//a[@class='shopping_cart_link']")
//	private WebElement addTocart;
//	
//	public void clickAddtoccart()
//	{
//		addTocart.click();
//	}
//	
	//homebutton
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	public void clickmenubutton()
	{
		menuButton.click();
	}
	
	//logoutbutton
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	
	
	//button[text()='Add to cart']

	
	//add to cart button
		@FindBy(xpath="//span[contains(@class,'shopping_cart')]")
		private WebElement addToCartButton;
		
		public String getTextFromCartButton()
		{
			String totalProducts = addToCartButton.getText();
			return totalProducts;
			
		}

		
	//multipal product selection
		
		@FindBy(xpath="//button[text()='Add to cart']")
		
		private List<WebElement>multipalAddProduct;  
		
		public void addAllProduct()
		{
			for(int i=1;i<=multipalAddProduct.size();i++)
			{
				multipalAddProduct.get(i).click();
			}
				
		}
	
	//constructor
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
}
