package com.stepdefinitions;

import com.global.Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps extends Objects{

	@Given("the user launches the sauceDemo website")
	public void the_user_launches_the_sauce_demo_website() {
      utilfunctions.maxmizeWindow();
      log.Info("window maximized");
	}

	@Given("the user enters the {string}")
	public void the_user_enters_the(String username) {
		loginpage.enterusername(username);
	}

	@Given("the user enters the password as {string}")
	public void the_user_enters_the_password_as(String password) {
		loginpage.enterpassword(password);
	}
	

	@Then("user click on the sign button")
	public void user_click_on_the_sign_button() {
		loginpage.clkButton();

	}
	
	
	/*
	 * // @Given("verify the title of the page with {string}") public void
	 * verify_the_title_of_the_page_with(String string) {
	 * 
	 * }
	 */

	@Given("the user click on the red shirt")
	public void the_user_click_on_the_red_shirt() throws InterruptedException {
		productspage.clickproduct();
		
	}

	@Given("the user click on the cartbutton")
	public void the_user_click_on_the_cartbutton() {
		cartpage.addToCartBtn();
		cartpage.clkCartBtn();
		
	}

	@Given("the user click on the checkoutbutton")
	public void the_user_click_on_the_checkoutbutton() {
		yourcart.checkout();
	}

	@Given("the user enters the firstname {string}")
	public void the_user_enters_the_firstname(String firstname) {
		shpage.enterfirstname(firstname);
		
	}

	@Given("the user enters the secondname {string}")
	public void the_user_enters_the_secondname(String secondname) {
		shpage.enterlastname(secondname);
		
	}

	@Given("the user enters the zipcode {string}")
	public void the_user_enters_the_zipcode(String postalcode) {
		shpage.enterpostalcode(postalcode);
		
	}

	@Given("the user clicks the continue")
	public void the_user_clicks_the_continue() {
		shpage.continueBtn();
		
	}

	@Given("the user click the finish")
	public void the_user_click_the_finish() {
		finishpage.clkfinish();
	}

	@Given("the user click on backtohome")
	public void the_user_click_on_backtohome() {
		bchome.backtohome();
	}

	@Then("user click on the menubutton")
	public void user_click_on_the_menubutton() {
		lopage.clkMenubtn();
		
	}

	@Then("the user click on logoutbutton")
	public void the_user_click_on_logoutbutton() throws InterruptedException {
		lopage.clkLogoutbtn();
	}

}
