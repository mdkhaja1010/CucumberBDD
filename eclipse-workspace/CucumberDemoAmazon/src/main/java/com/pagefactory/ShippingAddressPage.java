package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseClass;

public class ShippingAddressPage extends BaseClass {
	WebDriver driver;
	public ShippingAddressPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="input[placeholder='First Name']")
	private WebElement firstName;
	@FindBy(css="input[placeholder='Last Name']")
	private WebElement lastName;
	@FindBy(css="input[placeholder='Zip/Postal Code']")
	private WebElement zipPostal;
	@FindBy(css="input[id='continue']")
	private WebElement continueBtn;
	public void enterfirstname(String name) {
		utilfunctions.sendText(firstName, name);
		log.Info("shipping first name entered");
	}
	public void enterlastname(String name) {
		utilfunctions.sendText(lastName, name);
		log.Info("shipping last name entered");
	}
	public void enterpostalcode(String name) {
		utilfunctions.sendText(zipPostal, name);
		log.Info("shipping postal address entered");
	}
	public void continueBtn() {
		utilfunctions.clickElement(continueBtn);
		log.Info("shipping address completed");
	}

}
