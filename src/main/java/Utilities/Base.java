package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Config.PropertyFile;

public class Base {
	
	protected static WebDriver driver;
	public static PropertyFile properties;
	
	public Base()
	{
		properties = new PropertyFile();
		System.setProperty(properties.getDriver(),properties.getDriverPath());
		driver = new FirefoxDriver();
	}

}
