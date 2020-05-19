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
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	public WebElement streetaddress;
	
	@FindBy(xpath="//input[@placeholder='City']")
	public WebElement city;
	
	@FindBy(xpath="//input[@placeholder='State / County']")
	public WebElement State;
	
	@FindBy(xpath="//input[@placeholder='Zip Code']")
	public WebElement Zipcode;
	
	@FindBy(xpath="//div[@class='ui field']/label[text()='Social Channels']/../div/div/div/i")
	public WebElement social;
	
	@FindBy(xpath="//div[@class='ui field']/label[text()='Social Channels']/../div/div/div/div[2]/div[2]")
	public WebElement facebook;
	
	@FindBy(xpath="//div[text()='Country']/../i")
	public WebElement ctry;
	
	@FindBy(xpath="//div[@class='ui field']/div[@class='sixteen wide fields custom-address-container']/div[5]/div/input")
	public WebElement text;
	
	@FindBy(xpath="//div[@class='three wide field']/div/div[@role='listbox']/div/span[text()='India']")
	public WebElement india;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	public WebElement save;

}
