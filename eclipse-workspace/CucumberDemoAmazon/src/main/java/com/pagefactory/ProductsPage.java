package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseClass;

public class ProductsPage extends BaseClass{
	WebDriver driver;
	public ProductsPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String shirtprice;
		
		@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
		private WebElement product;
		@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")
		private WebElement productprice;
		
		public void clickproduct() throws InterruptedException {
			utilfunctions.clickElement(product);
			log.Info("select the product");
			
			
		}
		public void clkaddlogo() {
			shirtprice=validations.getText(productprice);
		 
		}
		
	

}
