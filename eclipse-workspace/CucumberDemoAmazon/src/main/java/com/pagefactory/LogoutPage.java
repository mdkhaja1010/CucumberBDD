package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseClass;

public class LogoutPage extends BaseClass {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menubtn;
	@FindBy(xpath="//nav[@class='bm-item-list']/./a[3]")
	private WebElement logoutbtn;
	public void clkMenubtn() throws Exception {
		utilfunctions.clickElement(menubtn);
		log.Info("menu button clicked");
		Thread.sleep(3000);
		
	}
	public void clkLogoutbtn() throws InterruptedException {
		utilfunctions.clickElement(logoutbtn);
		log.Info("logout sucessfully");
		Thread.sleep(3000);
		
	}
	
	

}
