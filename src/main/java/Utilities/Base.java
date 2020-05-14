package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;
import Pageobjects.Login_Page;

public class Base {
	
	protected static WebDriver driver;
	protected static PropertyFile properties;
	protected static Login_Page lp;
	public static WebDriverWait wait;
	protected static Actions a;
	
	public Base()
	{
		properties = new PropertyFile();
		System.setProperty(properties.getDriver(),properties.getDriverPath());
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,1000);
		a = new Actions(driver);
		lp = PageFactory.initElements(driver,Login_Page.class);
	}
	
	public static void close()
	{
		driver.quit();
	}

}
