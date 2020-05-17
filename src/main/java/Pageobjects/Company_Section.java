package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Company_Section {
	
	@FindBy(xpath="//div[@id='main-nav']/a[4]")
	public WebElement companies;
	
	@FindBy(xpath="//div[@id='dashboard-toolbar']/div[2]/div/a")
	public WebElement add;

	@FindBy(xpath="//div[@class='ui right corner labeled input']/input")
	public WebElement name;

}
