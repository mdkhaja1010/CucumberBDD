package com.global;

import org.openqa.selenium.WebDriver;

import com.utils.CreateLog;
import com.utils.PropertyFile;
import com.utils.UtilFunctions;
import com.utils.Validations;

public class BaseClass {
	public static WebDriver driver;
	//public Constants constants=new Constants();
	public CreateLog log=new CreateLog();
	public PropertyFile propertyfile=new PropertyFile();
	public String url=propertyfile.getApplicationUrl();
	public UtilFunctions utilfunctions= new UtilFunctions(driver);
	public String browser=propertyfile.getBrowserName();
	public Validations validations=new Validations();
	
	
	

}
