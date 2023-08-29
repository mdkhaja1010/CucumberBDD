package com.global;

import com.pagefactory.BackToHome;
import com.pagefactory.CartPage;
import com.pagefactory.FinishPage;
import com.pagefactory.LoginPage;
import com.pagefactory.LogoutPage;
import com.pagefactory.ProductsPage;
import com.pagefactory.ShippingAddressPage;
import com.pagefactory.YourCart;

public class Objects extends BaseClass{
	
	public LoginPage loginpage= new LoginPage(driver);
	public ProductsPage productspage=new ProductsPage(driver);
	public CartPage cartpage=new CartPage(driver);
	public ShippingAddressPage shpage=new ShippingAddressPage(driver);
	public FinishPage finishpage =new FinishPage(driver);
	public YourCart yourcart=new YourCart(driver);
	public LogoutPage lopage=new LogoutPage(driver);
	public BackToHome bchome=new BackToHome(driver);
	

}
