package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	public  WebElement login;
	
	@FindBy(xpath="//input[@placeholder='E-mail address']")
	public WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement submit;
	
	@FindBy(xpath="//div[@id='main-nav']/a[4]")
	public WebElement companies;
	
}
