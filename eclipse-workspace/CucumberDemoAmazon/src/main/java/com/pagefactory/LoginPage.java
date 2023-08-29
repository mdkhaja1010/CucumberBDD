package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.BaseClass;

public class LoginPage extends BaseClass {
   WebDriver driver;
   public LoginPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   @FindBy(id="user-name")
	private WebElement username1;
	@FindBy(id="password")
	private WebElement password1;
	@FindBy(id="login-button")
	private WebElement loginButton;
	@FindBy(xpath="//div[text()='Swag Labs']")
	private WebElement pagetitle;
	
	public void enterusername(String username) {
        utilfunctions.sendText(username1, username);
        log.Info("username is entered");
	}
	
	public void enterpassword(String password) {
		utilfunctions.sendText(password1, password);
		log.Info("password entered");
	}
	public void clkButton() {
		utilfunctions.clickElement(loginButton);
		log.Info("login sucessfully");
	}
	
}
