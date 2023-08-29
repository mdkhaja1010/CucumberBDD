package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends com.global.BaseClass {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css ="button[id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement addToCart;
	@FindBy(css = "div[id='shopping_cart_container']")
	private WebElement cartButton;
	public void addToCartBtn() {
	utilfunctions.clickElement(addToCart);
	log.Info("product added to cart");
		
	}
	public void clkCartBtn() {
		utilfunctions.clickElement(cartButton);
		log.Info("cartpage opened");
		
	}
	

}
