package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;

public class Base {
	
	protected static WebDriver driver;
	protected static PropertyFile properties;
	public static WebDriverWait wait; 
	
	public static void createDriver()
	{
		properties = new PropertyFile();
		System.setProperty(properties.getDriver(),properties.getDriverPath());
		driver = new FirefoxDriver();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static WebDriverWait waitMethod()
	{
		return wait = new WebDriverWait(driver,1000);
	}
	public static void close()
	{
		driver.quit();
	}

}
