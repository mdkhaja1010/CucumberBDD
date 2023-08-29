package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseClass;

public class BackToHome extends BaseClass{
WebDriver driver;
	
	public BackToHome(WebDriver driver) {
		this.driver=driver;
   	 PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="#back-to-products")
	private WebElement backbutton;
	public void backtohome() {
		utilfunctions.clickElement(backbutton);
		log.Info("navigation back to homepage");
	}

}
