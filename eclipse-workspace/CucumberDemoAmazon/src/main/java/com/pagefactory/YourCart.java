package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseClass;

public class YourCart extends BaseClass {
	WebDriver driver;
	public YourCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String cart;
    @FindBy(css="button[id='checkout']")
    private WebElement checkout;
    @FindBy(xpath="//div[@class='inventory_item_price']")
    private WebElement cartprice;
    
    public void checkout() {
    	utilfunctions.clickElement(checkout);
    }
    public void getcartprice() {
    	validations.getText(cartprice);
    	
    }

	
}
