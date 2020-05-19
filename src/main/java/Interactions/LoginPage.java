package Interactions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Config.PropertyFile;
import Pageobjects.Login_Page;
import Utilities.Base;

public class LoginPage {
	
	public WebDriver driver;
	public Login_Page lp;
	public PropertyFile properties;
	int i;
	
	public LoginPage()
	{
		properties = new PropertyFile();
	}
	
	public void VerifyLogin()
	{
		Base.createDriver();
		driver = Base.getDriver();
		lp = PageFactory.initElements(driver,Login_Page.class);
		driver.get("https://www.freecrm.com/");
		Base.waitMethod().until(ExpectedConditions.visibilityOf(lp.login));
		lp.login.click();
		lp.email.sendKeys(properties.getUsername());
		lp.password.sendKeys(properties.getPassword());
		lp.submit.click();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
