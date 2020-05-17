package Interactions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Config.PropertyFile;
import Pageobjects.Company_Section;
import Pageobjects.Login_Page;
import Utilities.Base;
public class CompanySection {
	
	public WebDriver driver;
	public PropertyFile properties;
	public Company_Section com; 
	public Login_Page lp;
	
	public CompanySection()
	{
		properties = new PropertyFile();
	}
	
	
	public void verifyAdd()
	{
		Base.createDriver();
		driver = Base.getDriver();
		com = PageFactory.initElements(driver,Company_Section.class);
		lp = PageFactory.initElements(driver,Login_Page.class);
		driver.get("https://www.freecrm.com/");
		Base.waitMethod().until(ExpectedConditions.visibilityOf(lp.login));
		lp.login.click();
		lp.email.sendKeys(properties.getUsername());
		lp.password.sendKeys(properties.getPassword());
		lp.submit.click();
		Base.waitMethod().until(ExpectedConditions.visibilityOf(com.companies));
		com.companies.click();
		com.add.click();
		for(int i=0;i<=2;i++)
		{
		driver.navigate().refresh();
		}
		Base.waitMethod().until(ExpectedConditions.visibilityOf(com.name));
		com.name.sendKeys("LTI");
	}
	
	public void closeBrowser()
	{
		Base.close();
	}

}
